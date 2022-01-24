public class Pizza {
    int pizzaSize = 0;
    int numToppings = 0;
    double pizzaPrice = 0;
    double tax = 0;

    public void setSize(int size) {
        pizzaSize = size;
    }

    public void setToppings(int toppings) {
        numToppings = toppings;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void calculateBasePizzaPrice() {
        //TODO Student
    }

    public void addDeliveryFee(int delivery) {
        //TODO Student
    }

    public void addPizzaTax(int taxRate) {
        //TODO Student
    }

    public double getPrepTime() {
        //TODO Student
        return 0; //This line will also be changed.
    }
}
