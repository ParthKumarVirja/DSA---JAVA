import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

 // for loop    
        // for(int i=0 ; i<11 ; i++){
        //     System.out.println(i);
        // }

// while loop        
        // int i = 0;
        // while (i<11) {
        //     System.out.println(i);
        //     i = i + 1;   // i++;
        // }

// do while loop 
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while(i<11);


 // sum of n no.s
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=0; i<=n ; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

// Tables
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        for(int i=1; i<=10 ; i++) {
            System.out.println(n*i); 
        }
        
    }
}