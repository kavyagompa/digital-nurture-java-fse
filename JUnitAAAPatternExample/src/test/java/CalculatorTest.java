import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    int a;
    int b;

    @Before
    public void setUp() {
        a = 10;
        b = 5;
    }

    @After
    public void tearDown() {
        a = 0;
        b = 0;
    }

    @Test
    public void testAddition() {
        int result = a + b;
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = a - b;
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = a * b;
        assertEquals(50, result);
    }
}