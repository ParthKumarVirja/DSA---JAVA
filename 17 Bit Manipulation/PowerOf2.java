public class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and (n & (n - 1)) == 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOf2 solution = new PowerOf2();
        System.out.println(solution.isPowerOfTwo(1));   // true
        System.out.println(solution.isPowerOfTwo(16));  // true
        System.out.println(solution.isPowerOfTwo(3));   // false
        System.out.println(solution.isPowerOfTwo(4));   // true
        System.out.println(solution.isPowerOfTwo(5));   // false
        System.out.println(solution.isPowerOfTwo(1024));// true
    }
}
