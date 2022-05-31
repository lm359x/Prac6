package Prac7.Decorator;

public class Chickenburger implements Burger{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public int getNutritionalValue() {
        return 337;
    }

    @Override
    public String getInfo() {
        return "Cheeseburger";
    }
}
