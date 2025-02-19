import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Find Sum of all Odd Num. Till : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i=i+2) {   // for even num. i starts with 2 (i=2 to n)
            sum += i; 
        }
        System.out.println(sum);
    }
}
