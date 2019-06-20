package ro.itschool.mvnbase.curs6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTDDTest {
    @Test
    @DisplayName("WHEN adding two zeros Then zero is returned")
    void addingZeroReturnsZero() {

        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();
        // RUN
        int result = calculator.add(0, 0);

        //ASSERT
        assertTrue(result == 0);
    }

    @Test
    @DisplayName("WHEN adding two positive numbers THEN their sum is returned")
    void addingThoPositiveRetunsSum(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result= calculator.add(4,5);

        //ASSERT
        assertEquals(9,result);
    }

    @Test
    @DisplayName("WHEN divide a number with one THEN the intitial number is retuned")
    void divisionOneReturnOne(){
        //SETUP
        CalculatorTDD calculator = new CalculatorTDD();

        //RUN
        int result= calculator.div(5,1);

        //ASSERT
        assertEquals(5,result);

    }


}