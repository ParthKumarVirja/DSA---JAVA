public class LargestNum {
    public static int getLargest(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(largest < nums[i])
                largest = nums[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,5,3};
        System.out.println("L:argest value :"+getLargest(num));
    }
}
