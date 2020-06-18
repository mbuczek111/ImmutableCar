import java.util.Arrays;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {
        Car myCar = createCar();
        System.out.println(myCar.getEngine());
        myCar.getEngine().setHorsePower(0);
        myCar.getEngine().setVolume(0);
        System.out.println(myCar.getEngine());

        System.out.println(myCar.getWheels());
        myCar.getWheels().get(0).setRadius(0);
        myCar.getWheels().get(0).setWidth(0);
        System.out.println(myCar.getWheels());
    }



    public static Car createCar() {
        Engine engine = new Engine("normal", 150,50);
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length ; i++)
        {
        wheels[i]=new Wheel(30,10);
        }
        Car car = new Car("Skoda","Fabia", engine, List.of(wheels));
        return car;
    }
}