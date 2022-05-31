package Prac6.FactoryMethod;


import Prac6.FactoryMethod.Money.Money;
import Prac6.FactoryMethod.Money.Russian.*;

public class RussianMoneyMaker extends MoneyMaker{
    @Override
    protected Money PrintMoney(Amount amount) {
       Money money = switch (amount){
           case SMALL -> new RussianSmallMoney();
           case MEDIUM -> new RussianMediumMoney();
           case LARGE -> new RussianLargeMoney();
           default -> null;
       };
        return money;
    }
}
