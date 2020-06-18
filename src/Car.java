import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;


public final class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final List<Wheel> wheels;

    public Car(String manufacturer, String model, Engine engine, List<Wheel> wheels) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
        this.wheels = wheels.stream()
                .map(wheel -> new Wheel(wheel.getRadius(), wheel.getWidth()))
                .collect(toList());
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturer.equals(car.manufacturer) &&
                model.equals(car.model) &&
                engine.equals(car.engine) &&
                wheels.equals(car.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, engine, wheels);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return new Engine(engine.getType(), engine.getHorsePower(), engine.getVolume());
    }

    public List<Wheel> getWheels() {
        return wheels.stream()
                .map(wheel -> new Wheel(wheel.getRadius(), wheel.getWidth()))
                .collect(toList());
    }
}