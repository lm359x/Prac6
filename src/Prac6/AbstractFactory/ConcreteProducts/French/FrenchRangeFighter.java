package Prac6.AbstractFactory.ConcreteProducts.French;

import Prac6.AbstractFactory.AbstractProducts.RangeFighter;

public class FrenchRangeFighter implements RangeFighter {
    @Override
    public void Shoot() {
        System.out.println("Мушкетеры - залп!");
    }
}
