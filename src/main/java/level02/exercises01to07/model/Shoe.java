package level02.exercises01to07.model;

import java.util.Objects;

/**
 * PROGRAM: Shoe
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Shoe {
    private String name;
    private String model;

    public Shoe(String name, String model) {
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
        Shoe shoe = (Shoe) obj;
        return name.equalsIgnoreCase(shoe.name) && model.equalsIgnoreCase(shoe.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

