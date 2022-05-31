package Prac6.AbstractFactory.ConcreteProducts.French;

import Prac6.AbstractFactory.AbstractProducts.SiegeFighter;

public class FrenchSiegeFighter implements SiegeFighter {
    @Override
    public void Discharge() {
        System.out.println("Гаубица стреляет!");
    }
}
