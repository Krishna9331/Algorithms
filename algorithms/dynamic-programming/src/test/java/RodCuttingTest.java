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
    public void verifyOptimalValue() {
        int [] price = {0, 1, 5, 8, 9};
        int result = rodCutting.rodCuttingBottomUpApproach(price, 4);

        assertEquals(10, result);
    }
}
