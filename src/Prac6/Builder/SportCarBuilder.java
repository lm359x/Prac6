package Prac6.Builder;

public class SportCarBuilder implements CarBuilder{
    private String chassis;
    private String body;
    private String paint;
    private String interior;

    @Override
    public CarBuilder fixChassis() {
        System.out.println("+sport chassis");
        this.chassis="Sport chassis";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("+sport body");
        this.body="Sport body";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("+sport paint");
        this.paint="Red";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("+sport interior");
        this.interior="Sport interior";
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
