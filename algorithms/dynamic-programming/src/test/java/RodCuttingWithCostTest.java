import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RodCuttingWithCostTest {

    private RodCuttingWithCost rcwc;

    @Before
    public void setUp() {
        rcwc = new RodCuttingWithCost();
    }

    @Test
    public void testRevenueWithCuttingCostNoCutRequired() {
        int[] price = {0, 1, 5, 8, 9};
        int[] cost = {0, 2, 3, 5, 3};
        int result = rcwc.rodCuttingWithCost(4, price, cost);

        assertEquals(9, result);
    }

    @Test
    public void testRevenueWithCuttingCostWithCuttingRequired() {
        int[] price = {0, 1, 5, 7, 8};
        int[] cost = {0, 1, 1, 1, 1};
        int result = rcwc.rodCuttingWithCost(4, price, cost);

        assertEquals(9, result);
    }
}
