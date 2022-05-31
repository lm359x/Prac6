package Prac6.AbstractFactory.ConcreteProducts.Russian;

import Prac6.AbstractFactory.AbstractProducts.MeleeFighter;

public class RussianMeleeFighter implements MeleeFighter {
    @Override
    public void Attack() {
        System.out.println("Казак рубит шашкой!");
    }
}
