package Prac6.FactoryMethod;


import Prac6.FactoryMethod.Money.Money;

public class Main {
    public static void main(String[] args) {
        MoneyMaker kazakhMoneyMaker = new KazakhMoneyMaker();
        for(Amount amount: Amount.values()){
            Money kazakhMoney = kazakhMoneyMaker.GiveMoney(amount);
            System.out.println(kazakhMoney.getHowMuch());
        }
        MoneyMaker russianMoneyMaker = new RussianMoneyMaker();
        for(Amount amount: Amount.values()){
            Money russianMoney = russianMoneyMaker.GiveMoney(amount);
            System.out.println(russianMoney.getHowMuch());
        }
    }
}
