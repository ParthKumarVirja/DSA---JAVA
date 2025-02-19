import java.util.Scanner;

public class primeChecker {
    public static boolean isPrime(int n) {
        for(int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        } 
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number to check Prime : ");
        int n = sc.nextInt();
        
        System.out.println("Number is prime ? : " + isPrime(n));
    }
    
}