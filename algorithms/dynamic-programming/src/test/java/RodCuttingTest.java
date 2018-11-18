import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RodCuttingTest {

    private RodCutting rodCutting;

    @Before
    public void setup() {
        rodCutting = new RodCutting();
    }

    @Test
    public void testOptimalValue() {
        int [] price = {0, 1, 5, 8, 9};
        int result = rodCutting.rodCuttingBottomUpApproach(price, 4);

        assertEquals(10, result);
    }

    @Test
    public void testOptimalValue1() {
        int [] price = {0, 1, 5, 8, 9, 10, 17, 17, 20};
        int result = rodCutting.rodCuttingBottomUpApproach(price, 8);

        assertEquals(22, result);
    }
}
