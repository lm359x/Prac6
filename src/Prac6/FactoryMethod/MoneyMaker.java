package Prac6.FactoryMethod;

import Prac6.FactoryMethod.Money.Money;

public abstract class MoneyMaker {
    public Money GiveMoney(Amount amount) {
        Money money = PrintMoney(amount);
        money.preparePaper();
        money.colorPaper();
        money.dryPaper();
        return money;
    }

    protected abstract Money PrintMoney(Amount amount);
}
