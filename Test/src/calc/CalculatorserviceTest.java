package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorserviceTest {

    private Calculator calculator;
    private Calculatorservice service;
    
    @BeforeEach
    public void setup() {
        calculator = new Calculator();
        service = new Calculatorservice(calculator);
    }
    
    
    @Test
    public void testAddAndReport() {
       assertEquals("Result:5", service.addAndReport(2, 3));
    }
    
    @Test
    public void testsubtractAndReport() {
        assertEquals("Result:1", service.subtractAndReport(3, 2));
    }
    

    
    
    

}
