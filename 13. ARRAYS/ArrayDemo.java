import java.util.Scanner;

public class ArrayDemo {
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

        //output
        System.out.println("Array : ");
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}