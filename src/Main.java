public class Main {
    public static void main(String[] args) {
       BasicCar basicCar = new BasicCar();
       Car passengerCar= new PassengerCar(basicCar);
       passengerCar.design();

    }
}