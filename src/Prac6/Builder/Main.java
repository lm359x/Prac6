package Prac6.Builder;

public class Main {
    public static void main(String[] args) {
//        CarBuilder carBuilder = new SportCarBuilder();
        CarBuilder carBuilder = new TaxiCarBuilder();
        Director director = new Director(carBuilder);
        Car car = director.BuildCar();
        if(car!=null){
            System.out.println(car);
        }
    }
}
