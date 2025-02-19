public class BubbleSort {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7, 8, 9, 17, 12};
        // bubble sort
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swaps = false;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps = true;
                }
            }
            // If no swaps were made in this pass, the array is sorted
            if(swaps == false){
                break;
            }
        }
        printArray(arr);
    }   
}
