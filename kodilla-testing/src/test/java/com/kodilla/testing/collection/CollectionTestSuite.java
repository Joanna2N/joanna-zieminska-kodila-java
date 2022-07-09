package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

// test sprawdzający, czy klasa zachowuje się poprawnie, gdy lista jest pusta
    @DisplayName("when ..., " +
            "then ... should return ..."
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
       ArrayList<Integer> emptyList = new ArrayList<Integer>();

        //When
       ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing " + listNumbers);

        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }

// test sprawdzający, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste
    @DisplayName("when ..., " +
            "then ... should return ..."
    )


    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given

       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(48,55,23,554,2,457,22));
       ArrayList<Integer> oddList = new ArrayList<Integer>(Arrays.asList(48,554,2,22));

        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing" + listNumbers);

        //Then
        Assertions.assertEquals(oddList, listNumbers);
    }

}
