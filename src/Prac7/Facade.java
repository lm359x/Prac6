package Prac7;

import Prac7.Decorator.*;

import java.util.Scanner;

public class Facade {
    public int Order() throws NullPointerException{
        System.out.println("1.cheeseburger\t2.chickenburger\n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Burger myBurger = switch (choice){
            case 1 -> new Cheeseburger();
            case 2 -> new Chickenburger();
            default -> null;
        };
        Burger upgraded = myBurger;
        if(myBurger!=null){
            do {
                System.out.println("Wanna upgrade?\n1.Double\t2.Fresh\tOther.No");
                choice = scanner.nextInt();
                upgraded = switch (choice) {
                    case 1 -> new DoubleBurgerDecorator(upgraded);
                    case 2 -> new FreshBurgerDecorator(upgraded);
                    default -> upgraded;
                };
            }while (choice==1||choice==2);
            System.out.println(upgraded.getInfo());
            return upgraded.getPrice();
        }
        return 0;
    }
}
