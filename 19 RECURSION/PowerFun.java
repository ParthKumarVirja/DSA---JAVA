public class PowerFun {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        // Handle negative exponents
        if (n < 0) {
            x = 1 / x;      // ***

            // Special handling for Integer.MIN_VALUE
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                return x * myPow(x, n);
            } else {
                n = -n;   // ***
            }
        }

        // Recursive call and squaring the result
        double halfPow = myPow(x, n / 2);
        double halfPowSq = halfPow * halfPow;

        // If n is odd, multiply by x one more time
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }

        return halfPowSq;
    }
    public static void main(String[] args) {
        double x = 2;
        int n = -1;
         double ans = myPow(x, n);
         System.out.println(ans);
    }
}