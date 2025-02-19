import java.util.Scanner;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Rows :");
        int rows = sc.nextInt();
        System.out.print("No. of Rows :");
        int cols = sc.nextInt();

        int[][] num = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        //output
        System.out.println("2D Array : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
