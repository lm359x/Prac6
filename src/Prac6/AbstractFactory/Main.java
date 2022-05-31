package Prac6.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Application frenchApplication = new Application(Country.FRANCE);
        Application russianApplication = new Application(Country.RUSSIA);
    }
}
