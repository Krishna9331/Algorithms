import static java.lang.Integer.MIN_VALUE;
import static java.lang.Math.max;

/**
 * <pre>
 * Give a rod of length n, and price table p where for length of rod i price is p(i) for 1 <= i <= n.
 * Find the maximum revenue for cutting the rod.
 *
 * Soln:
 * Lets say r(i) is the optimal(max) revenue for cutting the rod of length i. Considering that we have option of either
 * cut a rod of length i or leave it as it is.
 * r(n) = max(p(n), r(1) + r(n-1), r(2) + r(n-2) ... r(n-1)+ r(1))
 * We have considered all the possible cut for the rod, i.e 2^n-1, as for given length of rod n we can cut it in 2^n-1 way.
 *
 * We can reframe the problem as below say we cut the rod in two division and always first division is never cut further
 * and we apply optimization of second division only. e.g. say if we have rod of length n ->  we will consider it as
 * two division as 0 and n. Now we will apply further optimization at n length. This will reduce the complexity to:
 * r(i)  =     max   (p(i) + r(n-i))
 *            1<=i<=n
 * </pre>
 */
public class RodCutting {

    public int rodCuttingBottomUpApproach(final int [] price, final int length) {
        final int[] resultTable = new int[length + 1];
        int val = MIN_VALUE;
        for(int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                val = max(val, price[j] + resultTable[i - j]);
            }
            resultTable[i] = val;
        }
        return resultTable[length];
    }
}
