package Prac6.AbstractFactory.ConcreteProducts.Russian;

import Prac6.AbstractFactory.AbstractProducts.SiegeFighter;

public class RussianSiegeFighter implements SiegeFighter {

    @Override
    public void Discharge() {
        System.out.println("Единорог стреляет!");
    }
}
