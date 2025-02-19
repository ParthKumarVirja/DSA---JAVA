public class SubArrays {
    public static void printSubArray(int num[]) {
        int ts = 0;
        int sum=0;
        int temp=0;
        int large = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                for(int k=i;k<=j;k++) {
                    System.out.print(num[k]+" ");
                    sum += num[k];
                }
                System.out.println();
                System.out.println("Sum of sub array :"+sum);
                temp = sum;
                sum =0;
                ts++;
                if(large < temp )
                    large = temp;
            }
            System.out.println();
        }
        System.out.println("total subarrays :"+ ts);
        System.out.println("larger among all sums:"+large);
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        printSubArray(num);
    }
}