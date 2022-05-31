package Prac6.FactoryMethod;

import Prac6.FactoryMethod.Money.Money;
import Prac6.FactoryMethod.Money.Kazakh.*;


public class KazakhMoneyMaker extends MoneyMaker {
    @Override
    protected Money PrintMoney(Amount amount) {
        Money money = switch (amount){
            case SMALL -> new KazakhSmallMoney();
            case MEDIUM -> new KazakhMediumMoney();
            case LARGE -> new KazakhLargeMoney();
            default -> null;
        };
        return money;
    }
}
