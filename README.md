# Lab 02 - Methods and Objects
## Introduction
After completing all of the following methods, you will be expected to test each of the methods, as well as those included within your Pizza object. These tests will be performed using the commented lines within your **main** method.

This lab only has one file that you will modify, **Pizza.java**, but three files are included to allow you to test and run the Pizza Ordering Application.

Within the **Pizza.java**, there are 4 variables that are associated with each "Pizza" object. Throughout this lab our "Pizza" object will have it's variables modified to yield the correct output. 

For more information on `Methods` and `Objects`, there is background information included below the steps.

## Pre-Step: Application Flow
To view the application, check out **OpenPizzaOrderingApp.java**, this file contains our *main* method.
Within the *main* method you can see a commented out runApp() method call. Once you are finished with all of the steps and have tested each method you should uncomment this call and see how the applicaiton runs.

As you follow the below summary, try to follow along and read through the application to gain a better understanding of how it works.

To get into the application flow that begins in runApp(), we first create two objects, a *Scanner* and a *Pizza*. After object creation we call *printWelcome()* to print a simple welcome message, this is followed by a call to to the *getPizzaInfo(scnr, pizzaObj)* method. Within that call we pass both previously created objects to be used within the method.

Once we have and set the needed information in *getPizzaInfo* we invoke the Pizza object's *calculateBasePizzaPrice* method to attain the pizza's base price. The two following methods, *getDeliveryInfo(scnr, pizzaObj)* & *getTaxInfo(scnr, pizzaObj)*, are used to add additional costs on top of the base price.

For the last part of our application we use *printFinalInfo()* to print the final information that the app user would find useful.

### Testing
As you work through the following methods, there is an included testing file that you can use by uncommenting the test method calls in the *main* method. Once uncommented you should see the test's output in the program output section of zyBooks. 

It is recommended to test your methods as you work through them in this assignment and many future assignments. Once finished with all of the following steps run the tests all at once.

After completing the steps you can run the application by uncommenting the *runApp()* call in the *main* method. ZyBooks can be finicky with user input so on the *Enter program input* enter a pizza size(1-3), number of toppings (0-10), delivery confirmation (0-1), and a tax rate (0-20). Once you have these four whole numbers in the program input, run your application in develop mode with uncommented *runApp()*.

## Step 1: App Runthrough
Before you begin to program try to run through the Application in its entirety. Do this by following the method calls and reading through what each method does after it is called.

Once you feel that you have a decent understanding, run the application in zyBook's **Develop Mode**. It will not display the correct output until you have completed the required methods within **Pizza.java**, but it should still run in its current state.

### The following steps will be implemented by you within the Pizza.java file.
Within the **main** method of the **OpenPizzaOrderingApp.java**

## Step 2: calculateBasePizzaPrice()
To begin with this method, the variables pizzaSize & numToppings must be set within the Pizza object, this is already done within the application and tester files.

Using the pizzaSize & numToppings, it sets the correct pizza price. The pizza price ranges from 1-3, whichever size is chosen is multiplied by a factor of 6.5 and added to the pizzaPrice variable that also present within the Pizza object. The same applies to numToppings, 0-10, which is multiplied by a factor of .65.

Example: Given a size 2 pizza & 0 toppings the pizza's base price would be $13.00. Given a size 3 pizza with 4 toppings the pizza's base price would be  $22.10.

## Step 3: addDeliveryFee(int delivery)
This method takes a singular parameter, *delivery*, which will be a 1 or 0 depending if the application user requested delivery. When the *delivery* is 1, 5 will be added to the running pizzaPrice variable. When the *delivery* is 0, no fee needs to be added.

A simple multiplication statement is the best solution to this method.

## Step 4: addPizzaTax(int taxRate)
This methods single parameter is a whole number, the *taxRate* variable. Using this taxRate, you will calculate the tax that would be applied to this pizza using the base price and added delivery fee.

The taxRate parameter will be provided as a whole number, so it should be converted to a decimal to make the tax calculation more simple.

## Step 5: getPrepTime()
**getPrepTime** follows the same logic as the **calculateBasePrice()** method, but instead of a price, this method will calculate the time it takes to prep this pizza and then return that value. The pizzaSize is now multiplied by a factor of 8 and then added to a variable. The numToppings is then multiplied by a factor of 1.5 and added to you previously declared variable.

After you add both products to your variable, you then return it.

# Background Information

## Methods
Methods are one of the most important concepts in programming, as they are essentially the "building blocks" of code. As we described the "main" method in the last lab, methods must reside within a class. Methods may or may not also return a single variable. 

Each method begins with a signature, and it contents are denoted by opening and closing curly braces, "{ }".

A method signature has the following format:
``` java
[access modifier] [return type] [method name] (p1Type p1Name, p2Type p2Name, ...) {
    Method Contents

    return value;
}
```
[access modifier]: For now, all of our methods will be **public**, later our methods can also be private or protected.

[return type]: This indicates what variable type must be returned by a method, such as **int**, **String**, **double**, or **void**. The **void** return type is special as it indicates the method does not return anything, in this case it may print useful information or even modify a variable instead of returning one.

[method name]: A method name is only used to indicate what a particular method does and we use this name to call the method in our program. The *camelCase* convention is typically followed for naming methods, so the first letter of the first word is not capitalized, and the following first letters are. Say if we had a method that printed the parameter given to it, a good name may be *printParameter*.

(p1Type p1Name, ...): Parameters are variables given to the method that are required for it to function. The formatting is the variable type, followed by the name that will be used for the variable. You must use a comma inbetween multiple parameters if more than one is required. In the case that our method requires two variables, an **int** and a **String**, our parameter section would look as follows like (int number, String word).

return value: Whenever a return type other than **void** is specified, the method MUST return a value that corresponds to the return type. If you want a **void** method to terminate at a certain point, you can use **return** with no value after it.

Lastly, remember that the entire contents of your method must be encased within curly braces, "{ }".

A short example method that returns the sum of it's two parameters would look like:
``` java
public int addParameters(int p1, int p2) {
    int sum = p1 + p2;
    return sum;
}
```
If we wanted to use this method within our programs **main** method we could call it and assign it like so:
``` java
public static void main(String[] args) {
    int x = 12;
    int y = 3;
    int mainSum = addParameters(x, y);
    //NOTE: when addParameters is called, we set it to an int type as that is the return type of the addParameters method.
    //NOTE: When calling our method, addParameters, we also do not need to specify the variables that are provided, as two int types are expected.
}
```


## Objects

As Java is what is known as an object-oriented programming language, everything relates to an object in some sense.

Almost every object has variables and methods associated with it.

For a real analogy we could say a car is an object, and how a car has a max speed, color, and different parts, each of these could be tied to a variable within an object. A car can also drive, brake, and turn, each of these functions within a car could be tied to a method within an object.

An object is contained within a class. 

Method naming uses camelCase, objects and classes have the first letter in each word capitalized.

A very simple object may look like:
``` java
public class MyObject {
    int data = 13;
    public void printData() {
        System.out.println(data);
    }
}
```
Now that our object/type, MyObject, has been assembled we need to create an *instance* of the object using the **new** keyword and call our *printData()* method by referring to our newly created instance like so:
``` java
public static void main(String[] args) {
    MyObject obj = new MyObject();
    obj.printData();
}
```
After we call the *printData()* method that is apart of the *MyObject* object/type, our data, 13, will then be printed.

This was only to serve as a small introduction to objects and calling methods that are apart of objects, we will greatly expand upon methods and objects further in this course.
