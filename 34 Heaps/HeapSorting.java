public class HeapSorting {
    private static void heapify(int[] arr, int i, int size) {
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;          // for maxHeap  - ascending order sorting
        // int minHeap = i;        //  for minHeap - descending order

        if(left < size && arr[left] > arr[maxIdx]) {  // arr[left] < arr[minIdx]   
            maxIdx = left;
        } if(right < size && arr[right] > arr[maxIdx]) {    // arr[right] < arr[minIdx]
            maxIdx = right;
        }
        if(maxIdx != i) {
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }
    }
    public static void heapSort(int[] arr) {
        // step1 - build  maxHeap
        int n = arr.length;
        for(int i=n/2; i>=0; i--) {
            heapify(arr, i, n);
        }
        //step2 - push largets at last
        for(int i=n-1; i>0; i--) {
            //swap ( largest - first with last) 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        heapSort(arr);
        //print
        for(int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}