public class Practice01MathIterative implements Practice01Math {

    public int fib(int n) throws Exception {
        if (n < 0) {
            throw new Exception();
        } else if (n <= 1) {
            return n;
        }
        int a = 1;
        int b = 1;
        for (int i = 2; i < n; i++) {
            int c = a;
            a = a + b;
            b = c;
        }
        return a;
    }

    public int fact(int n) throws Exception {
        int x = n;
        if (n < 0) {
            throw new Exception();
        }
        for (int i = n - 1; i > 0; i--) {
            x *= i;
        }
        return x;
    }

}
