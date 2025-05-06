package level02.exercises01to07;

import level02.exercises01to07.data.DataTest;
import level02.exercises01to07.model.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

/**
 * PROGRAM: AssertJ_Test
 * AUTHOR: Diego Balaguer
 * DATE: 20/04/2025
 */

public class AssertJ_Test {

    private DataTest dataTest;
    private List<Object> objectList;
    private Map<String, Integer> testMap;
    private Object car, computer, fridge, ship, shoe;

    @BeforeEach
    void setUp() {
        dataTest = new DataTest();
        objectList = dataTest.getArrayListObjects();
        testMap = dataTest.getMapObjects();
        car = objectList.get(0);
        computer = objectList.get(1);
        fridge = objectList.get(2);
        ship = objectList.get(3);
        shoe = objectList.get(4);
    }

    @Test
    void givenTwoEqualIntegers_whenCompared_thenTheyAreEqual() {
        int actualNumber = dataTest.getInteger();
        int expectedNumber = actualNumber;

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }

    @Test
    void givenTwoDifferentIntegers_whenCompared_thenTheyAreNotEqual() {
        int actualNumber = dataTest.getInteger();
        int expectedNumber = actualNumber + 50;

        assertThat(actualNumber).isNotEqualTo(expectedNumber);
    }

    @Test
    void givenTwoReferencesToSameObject_whenComparedByReference_thenTheyAreSame() {
        Object actualObject = dataTest.getObject();
        Object expectedObject = actualObject;

        assertThat(actualObject).isSameAs(expectedObject);
    }

    @Test
    void givenTwoDifferentObjects_whenComparedByReference_thenTheyAreNotSame() {
        Object actualObject = dataTest.getObject();
        Object expectedObject = dataTest.getObject();

        assertThat(actualObject).isNotSameAs(expectedObject);
    }

    @Test
    void givenTwoIdenticalIntArrays_whenCompared_thenTheyAreEqual() {
        int[] actualArray = dataTest.getIntArray();
        int[] actualArray02 = dataTest.getIntArray();

        assertThat(actualArray).isEqualTo(actualArray02);
    }

    @Nested
    class ListTests {

        @Test
        void givenObjectsAddedToList_whenCheckedOrder_thenContainsExactlyInOrder() {
            assertThat(objectList).containsExactly(car, computer, fridge, ship, shoe);
        }

        @Test
        void givenObjectsAddedToList_whenCheckedForContents_thenContainsExactlyInAnyOrder() {
            assertThat(objectList).containsExactlyInAnyOrder(shoe, ship, fridge, computer, car);
        }

        @Test
        void givenObjectAddedOnceToList_whenChecked_thenContainsOnlyOnce() {
            assertThat(objectList).containsOnlyOnce(fridge);
        }

        @Test
        void givenObjectNotAddedToList_whenChecked_thenListDoesNotContainIt() {
            Object camera = new Camera("Sony", "A300");
            assertThat(objectList).doesNotContain(camera);
        }
    }

    @Nested
    class MapTests {

        @Test
        void givenKeyMap_whenVerificationMapKey_thenMapContainsKey() {
            assertThat(testMap).containsKey("Proclamación de la Constitución Española");
        }
    }

    @Nested
    class ExceptionTests {

        @DisplayName("Should throw exception when accessing invalid index")
        @Test
        void givenInvalidListIndex_whenAccessed_thenThrowsIndexOutOfBoundsException() {
            assertThatThrownBy(() -> dataTest.getObjectById(10))
                    .isInstanceOf(IndexOutOfBoundsException.class)
                    .hasMessageContaining("Index 10 out of bounds for length 5");
        }
    }

    @Nested
    class OptionalTests {

        @Test
        void givenEmptyOptional_whenChecked_thenIsEmpty() {
            Optional<String> optionalEmpty = dataTest.getOptionalObjectEmpty();
            assertThat(optionalEmpty).isEmpty();
        }
    }
}
