package level02.exercises01to07.model;

import java.util.Objects;

/**
 * PROGRAM: Car
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Car {

    private String name;
    private String model;

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return name.equalsIgnoreCase(car.name) && model.equalsIgnoreCase(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
