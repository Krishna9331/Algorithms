public class Fibonacci {

    public int fibonacci(final int n) {
        final int[] result = new int[n + 1];
        result[0] = 0;
        if (n > 0) {
            result[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }
}
