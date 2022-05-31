package Prac7.Decorator;

public class Cheeseburger implements Burger{
    @Override
    public int getPrice() {
        return 60;
    }

    @Override
    public int getNutritionalValue() {
        return 263;
    }

    @Override
    public String getInfo() {
        return "Cheeseburger";
    }
}
