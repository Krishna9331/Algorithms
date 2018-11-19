public class FibonacciTailRecursion {

    public int fibonacciRec(int n) {
        return fibonacci(n, 0, 1);
    }

    private int fibonacci(int n, int p, int q) {
        if (n == 0) {
            return p;
        }
        if (n == 1) {
            return q;
        }
        return fibonacci(n - 1, q, p + q);
    }
}
