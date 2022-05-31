package Prac7.Decorator;

public class Main {
    public static void main(String[] args) {
        Burger chickenBurger = new Chickenburger();
        Burger doubleChickenBurger = new DoubleBurgerDecorator(chickenBurger);
        System.out.println(doubleChickenBurger.fullInfo());
        Burger cheeseBurger = new Cheeseburger();
        Burger modifiedBurger = new FreshBurgerDecorator(new DoubleBurgerDecorator(new DoubleBurgerDecorator(cheeseBurger)));
        System.out.println(modifiedBurger.fullInfo());
    }
}
