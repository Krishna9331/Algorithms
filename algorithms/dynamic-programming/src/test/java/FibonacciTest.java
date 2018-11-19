import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {

    private Fibonacci fib;

    @Before
    public void setUp() {
        fib = new Fibonacci();
    }

    @Test
    public void fib7() {
        assertEquals(13, fib.fibonacci(7));
    }

    @Test
    public void fib0() {
        assertEquals(0, fib.fibonacci(0));
    }

    @Test
    public void fib1() {
        assertEquals(1, fib.fibonacci(1));
    }

    @Test
    public void fib100000() {
        assertTrue(fib.fibonacci(100000) > 0);
    }
}
