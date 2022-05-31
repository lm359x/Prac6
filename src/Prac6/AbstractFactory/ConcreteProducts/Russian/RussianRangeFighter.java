package Prac6.AbstractFactory.ConcreteProducts.Russian;

import Prac6.AbstractFactory.AbstractProducts.RangeFighter;

public class RussianRangeFighter implements RangeFighter {
    @Override
    public void Shoot() {
        System.out.println("Стрельцы делают залп!");
    }
}
