public class PassengerCar extends Decorator{
    public PassengerCar(Car car) {
        super(car);

    }
    public void design(){
        super.design();
        System.out.print("Passenger car design.");
    }
}
