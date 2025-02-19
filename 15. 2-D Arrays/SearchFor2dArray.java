
import java.util.Scanner;

public class SearchFor2dArray  {
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

        System.out.println("Enter Element to Search : ");
        int x = sc.nextInt();

        //output
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ; j++) {
                if(num[i][j] == x)    
                    System.out.print("Element Found at Index : (" + i +"," + j + ")");
            }
            System.out.println();
        }

    }
}

