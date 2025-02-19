public class PatternDemo {
    public static void main(String[] args) {
        int n =4;
        int m = (2*n) - 1;

        for(int i=1; i<=m; i++) {
            int k=n;
            if(i<=n){
                for(int j=1; j<=m; j++) {
                    System.out.print(k);
                    if(i>j)
                        k -= 1;
                    if(i+j >= 2*n)
                        k += 1;
                }
            }
            if(i>n){
                for(int j=1; j<=m; j++) {
                    System.out.print(k);
                    if(j>=i)
                        k += 1;
                    if(i+j < 2*n)
                        k -= 1;
                }
            }
            System.out.println();
        }
    }
}

// import java.io.*;

// public class PatternDemo
// {

// // Function to 
// // print the pattern
// static void printPattern(int n)
// {
// 	// number of rows and 
// 	// columns to be printed
// 	int s = 2 * n - 1;

// 	// Upper Half
// 	for (int i = 0;
// 			i < (s / 2) + 1; i++) 
// 	{
// 		int m = n;

// 		// Decreasing part
// 		for (int j = 0; j < i; j++) 
// 		{
// 			System.out.print(m + " ");
// 			m--;
// 		}

// 		// Constant Part
// 		for (int k = 0; 
// 				k < s - 2 * i; k++) 
// 		{
// 			System.out.print(n - i + " ");
// 		}

// 		// Increasing part.
// 		m = n - i + 1;
// 		for (int l = 0; l < i; l++) 
// 		{
// 			System.out.print(m + " ");
// 			m++;
// 		}

// 		System.out.println();
// 	}

// 	// Lower Half
// 	for (int i = s / 2 - 1;
// 			i >= 0; i--) 
// 	{

// 		// Decreasing Part
// 		int m = n;
// 		for (int j = 0; j < i; j++)
// 		{
// 			System.out.print(m + " ");
// 			m--;
// 		}

// 		// Constant Part.
// 		for (int k = 0; 
// 				k < s - 2 * i; k++)
// 		{
// 			System.out.print(n - i + " ");
// 		}

// 		// Decreasing Part
// 		m = n - i + 1;
// 		for (int l = 0; l < i; l++) 
// 		{
// 			System.out.print(m + " ");
// 			m++;
// 		}
// 		System.out.println();
// 	}
// }
// // Driver Code
// public static void main (String[] args) 
// {
// 	int n = 4;

// 	printPattern(n);
// }
// }