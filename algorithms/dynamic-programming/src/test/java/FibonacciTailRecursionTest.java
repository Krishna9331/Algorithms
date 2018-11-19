import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciTailRecursionTest {

    private FibonacciTailRecursion fibRec;

    @Before
    public void setUp() {
        fibRec = new FibonacciTailRecursion();
    }

    @Test
    public void test7() {
        assertEquals(13, fibRec.fibonacciRec(7));
    }

    @Test
    public void test0() {
        assertEquals(0, fibRec.fibonacciRec(0));
    }

    @Test
    public void test1() {
        assertEquals(1, fibRec.fibonacciRec(1));
    }

    @Test
    public void test10000() {
        assertTrue(fibRec.fibonacciRec(10000) > 0);
    }
}
