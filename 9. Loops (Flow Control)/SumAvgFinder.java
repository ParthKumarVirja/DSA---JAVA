import java.util.Scanner;

public class SumAvgFinder {
    public static void main(String[] args) {
        double total = 0.;
        int count = 0;
        int ch;
        float avg;

        do {
            System.out.print("Enter value : ");
            Scanner sc = new Scanner(System.in);
            double temp = sc.nextDouble();

            total += temp;
            count++;
            System.out.print("Do you want to Countinue ? (1/0) :");
            ch = sc.nextInt();
        } while(ch == 1);
        avg = (float) (total / count);
        System.out.println("Total : " + total);
        System.out.println("Average :" + avg);

        
    }
}
