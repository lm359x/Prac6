package Prac7.Decorator;

public interface Burger {
    public int getPrice();
    public int getNutritionalValue();
    public String getInfo();
    public default String fullInfo(){
        return getInfo()+" "+getNutritionalValue()+"kkal "+" "+getPrice();
    }
}
