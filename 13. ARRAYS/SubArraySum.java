public class SubArraySum {
    public static void maxSumSubarray(int num[]) {  // Kadane's algo TC: O(n) 
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++) {
            currSum += num[i];
            if(currSum < 0)
                currSum = 0;
            maxValue = Math.max(maxValue, num[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        if(maxSum == 0){
            System.out.println("Maximum SubArray Sum is : " + maxValue);
        } else {
            System.out.println("Maximum SubArray Sum is : "+  maxSum);
        }

       
        
    }
    public static void main(String[] args) {
        int num[] = {-2,-3,0,-1,-2,0,0,-3};
        maxSumSubarray(num);
    }
}