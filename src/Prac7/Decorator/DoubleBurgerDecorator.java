package Prac7.Decorator;

public class DoubleBurgerDecorator implements Burger{
    private Burger base;

    public DoubleBurgerDecorator(Burger base) {
        this.base = base;
    }

    @Override
    public int getPrice() {
        return base.getPrice()+50;
    }

    @Override
    public int getNutritionalValue() {
        return (int)Math.round(base.getNutritionalValue()*1.5);
    }

    @Override
    public String getInfo() {
        return "Double "+base.getInfo();
    }
}
