package level02.exercises01to07.data;

import level02.exercises01to07.model.*;

import java.util.*;

/**
 * PROGRAM: DataTest
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class DataTest {

    public int getInteger() {
        return 60;
    }

    public Object getObject() {
        return new Object();
    }

    public int[] getIntArray() {
        return new int[]{10, 20, 30, 40};
    }

    public ArrayList<Object> getArrayListObjects() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Car("Ford", "Mondeo"));
        arrayList.add(new Computer("Asus", "Zenbook"));
        arrayList.add(new Fridge("Balay", "Tempomat"));
        arrayList.add(new Ship("Zodiac", "M200"));
        arrayList.add(new Shoe("Adidas", "Panamera"));
        return arrayList;
    }

    public Map<String, Integer> getMapObjects() {
        Map<String, Integer>  map = new HashMap<>();
        map.put("Descubrimiento de América", 1492);
        map.put("Llegada del hombre a la Luna", 1969);
        map.put("Proclamación de la Constitución Española", 1978);
        map.put("Descubrimiento del ADN", 1953);
        map.put("Caída del Muro de Berlín", 1989);
        return map;
    }

    public Object getObjectById(int id) {
        ArrayList<Object> arrayList = getArrayListObjects();
        return arrayList.get(id);
    }

    public Optional getOptionalObjectEmpty() {
        return Optional.empty();
    }
}
