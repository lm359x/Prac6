package Prac6.AbstractFactory.ConcreteProducts.French;

import Prac6.AbstractFactory.AbstractProducts.MeleeFighter;

public class FrenchMeleeFighter implements MeleeFighter {
    @Override
    public void Attack() {
        System.out.println("Вольтижеры атакуют!");
    }
}
