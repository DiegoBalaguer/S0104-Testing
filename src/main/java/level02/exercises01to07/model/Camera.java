package level02.exercises01to07.model;

import java.util.Objects;

/**
 * PROGRAM: Camera
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class Camera {

    private String name;
    private String model;

    public Camera(String name, String model) {
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
        Camera camera = (Camera) obj;
        return name.equalsIgnoreCase(camera.name) && model.equalsIgnoreCase(camera.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
