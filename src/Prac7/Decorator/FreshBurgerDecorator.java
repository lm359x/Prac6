package Prac7.Decorator;

public class FreshBurgerDecorator implements Burger{
    private Burger base;

    public FreshBurgerDecorator(Burger base) {
        this.base = base;
    }

    @Override
    public int getPrice() {
        return base.getPrice()+20;
    }

    @Override
    public int getNutritionalValue() {
        return base.getNutritionalValue()+16;
    }

    @Override
    public String getInfo() {
        return "Fresh "+base.getInfo();
    }
}
