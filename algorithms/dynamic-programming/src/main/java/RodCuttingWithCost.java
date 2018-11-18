import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

/**
 * <pre>
 *     Let's consider that if there is price involved for cutting rod and for cutting rod of length i the cost is c(i).
 *
 *     Now find the max revenue for cutting rod of length n where price of length i is p(i).
 * </pre>
 */

public class RodCuttingWithCost {

    public int rodCuttingWithCost(final int length, final int[] price, final int[] cost) {
        final int[] result = new int[length + 1];

        int val = MIN_VALUE;

        for(int i = 1; i <= length; i++) {
            for(int j = 1; j <= i; j++) {
                val = max(val, price[j] + result[i - j] - cost[i - j]);
            }
            result[i] = val;
        }
        return result[length];
    }
}
