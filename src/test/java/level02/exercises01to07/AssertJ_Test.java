package level02.exercises01to07;

import level02.exercises01to07.data.DataTest;
import level02.exercises01to07.model.*;

import java.util.*;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * PROGRAM: AssertJ_Test
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class AssertJ_Test {

    @Test
    void givenTwoEqualIntegers_whenCompared_thenTheyAreEqual() {
        DataTest dataTest = new DataTest();
        int numberActual = dataTest.getInteger();
        int numberExpected = numberActual;

        assertThat(numberActual).isEqualTo(numberExpected);
    }

    @Test
    void givenTwoDifferentIntegers_whenCompared_thenTheyAreNotEqual() {
        DataTest dataTest = new DataTest();
        int numberActual = dataTest.getInteger();
        int numberExpected = numberActual + 50;

        assertThat(numberActual).isNotEqualTo(numberExpected);
    }

    @Test
    void givenTwoReferencesToSameObject_whenComparedByReference_thenTheyAreSame() {
        DataTest dataTest = new DataTest();
        Object objectActual = dataTest.getObject();
        Object objectExpected = objectActual;

        assertThat(objectActual).isSameAs(objectExpected);
    }

    @Test
    void givenTwoDifferentObjects_whenComparedByReference_thenTheyAreNotSame() {
        DataTest dataTest = new DataTest();
        Object objectActual = dataTest.getObject();
        Object objectExpected = dataTest.getObject();

        assertThat(objectActual).isNotSameAs(objectExpected);
    }

    @Test
    void givenTwoIdenticalIntArrays_whenCompared_thenTheyAreEqual() {
        DataTest dataTest = new DataTest();
        int[] arrayActual = dataTest.getIntArray();
        int[] arrayActual02 = dataTest.getIntArray();

        assertThat(arrayActual).isEqualTo(arrayActual02);
    }

    @Test
    void givenObjectsAddedToList_whenCheckedOrder_thenContainsExactlyInOrder() {
        DataTest dataTest = new DataTest();
        ArrayList<Object> arrayTest = dataTest.getArrayListObjects();

        Object car = arrayTest.get(0);
        Object computer = arrayTest.get(1);
        Object fridge = arrayTest.get(2);
        Object ship = arrayTest.get(3);
        Object shoe = arrayTest.get(4);

        assertThat(arrayTest).containsExactly(car, computer, fridge, ship, shoe);
    }

    @Test
    void givenObjectsAddedToList_whenCheckedForContents_thenContainsExactlyInAnyOrder() {
        DataTest dataTest = new DataTest();
        ArrayList<Object> arrayTest = dataTest.getArrayListObjects();

        Object car = arrayTest.get(0);
        Object computer = arrayTest.get(1);
        Object fridge = arrayTest.get(2);
        Object ship = arrayTest.get(3);
        Object shoe = arrayTest.get(4);

        assertThat(arrayTest).containsExactlyInAnyOrder(shoe, ship, fridge, computer, car);
    }

    @Test
    void givenObjectAddedOnceToList_whenChecked_thenContainsOnlyOnce() {
        DataTest dataTest = new DataTest();
        ArrayList<Object> arrayTest = dataTest.getArrayListObjects();

        Object car = arrayTest.get(0);
        Object computer = arrayTest.get(1);
        Object fridge = arrayTest.get(2);
        Object ship = arrayTest.get(3);
        Object shoe = arrayTest.get(4);

        assertThat(arrayTest).containsOnlyOnce(fridge);
    }

    @Test
    void givenObjectNotAddedToList_whenChecked_thenListDoesNotContainIt() {
        DataTest dataTest = new DataTest();
        ArrayList<Object> arrayTest = dataTest.getArrayListObjects();

        Object car = arrayTest.get(0);
        Object computer = arrayTest.get(1);
        Object fridge = arrayTest.get(2);
        Object ship = arrayTest.get(3);
        Object shoe = arrayTest.get(4);
        Object camera = new Camera("Sony", "A300");

        assertThat(arrayTest).doesNotContain(camera);
    }

    @Test
    void givenKeyMap_whenVerificationMapKey_thenMapContainsKey() {
        DataTest dataTest = new DataTest();
        Map<String, Integer> map = dataTest.getMapObjects();

        assertThat(map).containsKey("Proclamación de la Constitución Española");
    }

    @Test
    void givenInvalidListIndex_whenAccessed_thenThrowsIndexOutOfBoundsException() {
        DataTest dataTest = new DataTest();

        assertThatThrownBy(() -> dataTest.getObjectById(10))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 10 out of bounds for length 5");
    }

    @Test
    void givenEmptyOptional_whenChecked_thenIsEmpty() {
        DataTest dataTest = new DataTest();
        Optional<String> optionalEmpty = dataTest.getOptionalObjectEmpty();

        assertThat(optionalEmpty).isEmpty();
    }
}