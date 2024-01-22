public class LuxuryCar extends Decorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    public void design(){
        super.design();
        System.out.print("LuxuryCar");
    }
}
