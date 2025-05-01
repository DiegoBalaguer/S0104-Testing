package level02.exercises01to07.model;

import java.util.Objects;

/**
 * PROGRAM: Ship
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Ship {

    private String name;
    private String model;

    public Ship(String name, String model) {
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
        Ship ship = (Ship) obj;
        return name.equalsIgnoreCase(ship.name) && model.equalsIgnoreCase(ship.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}