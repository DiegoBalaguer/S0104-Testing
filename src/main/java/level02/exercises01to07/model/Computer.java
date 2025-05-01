package level02.exercises01to07.model;

import java.util.Objects;

/**
 * PROGRAM: Computer
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Computer {

    private String name;
    private String model;

    public Computer(String name, String model) {
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
        Computer computer = (Computer) obj;
        return name.equalsIgnoreCase(computer.name) && model.equalsIgnoreCase(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
