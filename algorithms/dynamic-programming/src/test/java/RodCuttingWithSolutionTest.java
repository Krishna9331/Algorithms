import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RodCuttingWithSolutionTest {

    private RodCuttingWithSolution rcSol;

    @Before
    public void setUp() {
        rcSol = new RodCuttingWithSolution();
    }

    @Test
    public void testSolution () {
        int [] price = {0, 1, 5, 8, 9, 10, 17, 17, 20};
        RodSolution result = rcSol.rodCuttingWithSolution(8, price);
        assertEquals(22, result.maxRevenue);
        int [] sol = result.solutions;
        assertEquals(sol[8], 2);
        assertEquals(sol[8 - 2], 6);
    }
}
