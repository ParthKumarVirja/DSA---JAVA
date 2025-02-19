import java.util.Scanner;

public class LinearSearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        //input
        for(int i=0; i<size; i++) {
            System.out.println("Enter Element at index " + i );
            num[i] = sc.nextInt();
        }

        System.out.println("Enter num. to Search : ");
        int key = sc.nextInt();

        //output
        for(int i=0; i<num.length; i++) {
            if(num[i] == key)
                System.out.println("Searched Element Found at Index : " + i);
        }
    }
}