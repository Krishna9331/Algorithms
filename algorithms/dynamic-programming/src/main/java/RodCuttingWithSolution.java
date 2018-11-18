import static java.lang.Integer.MIN_VALUE;

public class RodCuttingWithSolution {

    public RodSolution rodCuttingWithSolution(int length, int[] prices) {
        int[] result = new int[length + 1];
        int[] solutions = new int[length + 1];
        int q = MIN_VALUE;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                if (q < prices[j] + result[i - j]) {
                    q = prices[j] + result[i - j];
                    solutions[i] = j;
                }
            }
            result[i] = q;
        }
        return new RodSolution(result[length], solutions);
    }
}

class RodSolution {
    int maxRevenue;
    int[] solutions;

    public RodSolution(int maxRevenue, int[] solutions) {
        this.maxRevenue = maxRevenue;
        this.solutions = solutions;
    }
}
