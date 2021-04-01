package cz.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    Calculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new Calculator();
    }

    // dived_validNumbers_shouldReturnResult

    // divide_ExtremeNumbers_shouldThrowException

    // divide_byZero_shouldThrowInvalidArgException

    @Test
    void setMemory_validParam_shouldSaveToMemory() {
        // GIVEN
        var INPUT = 5;

        // WHEN
        underTest.setMemory(INPUT);
        var result = underTest.getMemory();

        // THEN
        Assertions.assertEquals(INPUT, result, 0.00001);
    }


    @Test
    void addMemory_validParam_shouldAddToMemory() {
        // GIVEN
        var INPUT = 5;

        // WHEN
        underTest.addMemory(INPUT);
        underTest.addMemory(INPUT);
        var result = underTest.getMemory();

        // THEN
        Assertions.assertEquals(2 * INPUT, result, 0.00001);
    }


    @ParameterizedTest(name = "{index} - add {0} + {1} = {2}")
    @CsvSource(delimiter = ';', value = {
            "1;1.1;2.1",
            "5;1;6",
            "8;2;10"
    })
    void add(double a, double b, double expectedResult) {
        var result = underTest.add(a, b);

        Assertions.assertEquals(expectedResult, result);
    }
}
