import java.util.Stack;

public class NextGreaterUsingStack { // O(n) TC -> ( Next Greater Right )
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        for(int i=arr.length-1; i>=0 ; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) 
                nxtGreater[i] = -1;   // if no nxtGreater then Return -1;
            else
                nxtGreater[i] = arr[s.peek()];
            
                s.push(i);
        }
        for(int i=0; i<nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}


// Other Possible Variations/Combinations of Question/Problem/Code :

// 2) Next Greater Left :

//     for(int i=0; i<arr.length; i--) {
//     while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {

// 3) Next Smaller Right :

//     for(int i=arr.length-1; i>=0 ; i--) {
//     while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {

// 4) Next Smaller Left :

//     for(int i=0; i<arr.length; i--) {
//     while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {