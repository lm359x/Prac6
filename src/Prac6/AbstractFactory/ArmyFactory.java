package Prac6.AbstractFactory;

import Prac6.AbstractFactory.AbstractProducts.MeleeFighter;
import Prac6.AbstractFactory.AbstractProducts.RangeFighter;
import Prac6.AbstractFactory.AbstractProducts.SiegeFighter;

public interface ArmyFactory {
    MeleeFighter createMeleeFighter();
    RangeFighter createRangeFighter();
    SiegeFighter createSiegeFighter();

}
