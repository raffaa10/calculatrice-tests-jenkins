import fr.epsi.Calculatrice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Calculatrice class")
public class CalculatriceTest {

    private Calculatrice calculatrice;

    @BeforeEach
    public void setUpClass() {
        calculatrice = new Calculatrice();
    }

    @Test
    @DisplayName("10 plus 5 test")
    public void testAddition() {
        double a = 10;
        double b = 5;
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(15, calculatrice.addition(a, b));
    }

    @Test
    @DisplayName("4 moins 1 test")
    public void testSoustraction() {
        double a = 4;
        double b = 1;
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(3, calculatrice.soustraction(a, b));
    }

    @Test
    @DisplayName("Multiply 3 by 2 ")
    public void testMultiplication() {
        double a = 2;
        double b = 3;
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(6, calculatrice.multiplication(a, b));
    }

    @Test()
    @DisplayName("Division by zero")
    public void testDivision() {
        double a = 7;
        double b = 0;
        Calculatrice calculatrice = new Calculatrice();
        try {
            calculatrice.division(a, b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Division by 0");
        }
    }

    @Test
    @DisplayName(" 9 divided by 3 ")
    public void testMultiplication2() {
        double a = 9;
        double b = 3;
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(3, calculatrice.division(a, b));
    }

}
