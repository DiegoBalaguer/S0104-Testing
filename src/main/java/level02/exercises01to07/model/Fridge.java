package level02.exercises01to07.model;

import java.util.Objects;

/**
 * PROGRAM: Fridge
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Fridge {

    private String name;
    private String model;

    public Fridge(String name, String model) {
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
        Fridge fridge = (Fridge) obj;
        return name.equalsIgnoreCase(fridge.name) && model.equalsIgnoreCase(fridge.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
