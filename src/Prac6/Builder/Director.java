package Prac6.Builder;

public class Director {
    private CarBuilder carBuilder;
    public Director(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }
    public Car BuildCar(){
        return carBuilder.fixChassis().fixBody().fixInterior().paint().build();
    }
}
