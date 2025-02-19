public class Patterns {

    public static void main(String args[]) {
        SolidRectangle(4, 5);
        System.out.println();
        hollowRectangle(4, 5);
        System.out.println();
        halfPyramid(4);
        System.out.println();
        inverted_halfPyramid(4);
        System.out.println();
        inverted_rotated_halfPyramid(4);
        System.out.println();
        halfPyramid_withNumbers(5);
        System.out.println();
        inverted_halfPyramid_withNumbers(5);
        System.out.println();
        floyds_triangle(5);
        System.out.println();
        zero_one_triangle(5);
        System.out.println();
        butterfly(4);
        System.out.println();
        solid_rhombus(5);
        System.out.println();
        hollow_rhombus(5);
        System.out.println();
        diamond(4);
        System.out.println();
        number_pyramid(5);
        System.out.println();
        palindromic_pattern_withNumbers(5);
        System.out.println();
        
    }

    public static void SolidRectangle(int n, int m) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void hollowRectangle(int n, int m) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_halfPyramid(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            //spaces...
            System.out.println();
        }
    }

    public static void inverted_halfPyramid_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            //numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            //spaces...
            System.out.println();
        }
    }


    public static void floyds_triangle(int n) {
        int number = 1;
        for(int i=1; i<=n; i++) {
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(number +" ");
                number++;
            }
            //spaces ...
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            //binary bits
            for(int j=1; j<=i; j++) {
                if((i+j) % 2 == 0) { //even
                    System.out.print("1 ");
                } else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //stars 1
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            
            //spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars 2
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            
            //spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
    
            System.out.println();
        }
    }

    public static void diamond(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    public static void palindromic_pattern_withNumbers(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //descending
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //ascending
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}