package Prac6.AbstractFactory;

import Prac6.AbstractFactory.AbstractProducts.MeleeFighter;
import Prac6.AbstractFactory.AbstractProducts.RangeFighter;
import Prac6.AbstractFactory.AbstractProducts.SiegeFighter;
import Prac6.AbstractFactory.ConcreteProducts.French.FrenchMeleeFighter;
import Prac6.AbstractFactory.ConcreteProducts.French.FrenchRangeFighter;
import Prac6.AbstractFactory.ConcreteProducts.French.FrenchSiegeFighter;

public class FrenchArmyFactory implements ArmyFactory{
    @Override
    public MeleeFighter createMeleeFighter() {
        return new FrenchMeleeFighter();
    }

    @Override
    public RangeFighter createRangeFighter() {
        return new FrenchRangeFighter();
    }

    @Override
    public SiegeFighter createSiegeFighter() {
        return new FrenchSiegeFighter();
    }

    public FrenchArmyFactory(){
        System.out.println("Создаем армию Франции XIXв.");
    }
}
