package Prac6.Builder;

public class TaxiCarBuilder implements CarBuilder{
    private String chassis;
    private String body;
    private String paint;
    private String interior;
    @Override
    public CarBuilder fixChassis() {
        System.out.println("+casual chassis");
        this.chassis="Casual chassis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("+casual body");
        this.body="Casual body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("+casual paint");
        this.paint="Yellow-white";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("+casual interior");
        this.interior="Casual interior";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis,body,paint,interior);
        if(car.QualityCheck())
            return car;
        System.out.println("Quality check failed");
        return null;
    }
}
