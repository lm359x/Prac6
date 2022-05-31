package Prac6.AbstractFactory;

public class Application {
    private ArmyFactory armyFactory;
    public Application(Country country){
        armyFactory = switch(country) {
            case FRANCE -> new FrenchArmyFactory();
            case RUSSIA -> new RussianArmyFactory();
            default -> null;
        };
        armyFactory.createMeleeFighter().Attack();
        armyFactory.createRangeFighter().Shoot();
        armyFactory.createSiegeFighter().Discharge();
    }

}
