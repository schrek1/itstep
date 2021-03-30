package cz.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchTest {

    Search underTest;

    @BeforeEach
    void setUp() {
        underTest = new Search();
    }

    @Test
    void search_itemInArray_shouldReturnIndex() {
        var ARRAY = new int[]{1, 2, 3, 4, 5};

        var index = underTest.search(ARRAY, 3);

        Assertions.assertEquals(2, index);
    }

    @Test
    void search_itemNotInArray_shouldReturnMinusOne() {
        var ARRAY = new int[]{1, 2, 3, 4, 5};

        var index = underTest.search(ARRAY, 6);

        Assertions.assertEquals(-1, index);
    }

    @Test
    void search_searchedItemIsFirst_shouldReturnZero() {
        var ARRAY = new int[]{1, 2, 3, 4, 5};

        var index = underTest.search(ARRAY, 1);

        Assertions.assertEquals(0, index);
    }

    @Test
    void search_searchedItemIsLast_shouldReturnZero() {
        var ARRAY = new int[]{1, 2, 3, 4, 5};

        var index = underTest.search(ARRAY, 5);

        Assertions.assertEquals(4, index);
    }

    @Test
    void search_arrayIsNull_shouldReturnMinusOne() {
        var index = underTest.search(null, 6);

        Assertions.assertEquals(-1, index);
    }

    @Test
    void search_arrayIsEmpty_shouldReturnMinusOne() {
        var ARRAY = new int[0];

        var index = underTest.search(ARRAY, 6);

        Assertions.assertEquals(-1, index);
    }

}
