package cz.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
