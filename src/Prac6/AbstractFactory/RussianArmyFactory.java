package Prac6.AbstractFactory;

import Prac6.AbstractFactory.AbstractProducts.MeleeFighter;
import Prac6.AbstractFactory.AbstractProducts.RangeFighter;
import Prac6.AbstractFactory.AbstractProducts.SiegeFighter;
import Prac6.AbstractFactory.ConcreteProducts.Russian.RussianMeleeFighter;
import Prac6.AbstractFactory.ConcreteProducts.Russian.RussianRangeFighter;
import Prac6.AbstractFactory.ConcreteProducts.Russian.RussianSiegeFighter;

public class RussianArmyFactory implements ArmyFactory{
    @Override
    public MeleeFighter createMeleeFighter() {
        return new RussianMeleeFighter();
    }

    @Override
    public RangeFighter createRangeFighter() {
        return new RussianRangeFighter();
    }

    @Override
    public SiegeFighter createSiegeFighter() {
        return new RussianSiegeFighter();
    }

    public RussianArmyFactory(){
        System.out.println("Создаем армию России XVIIIв.");
    }
}
