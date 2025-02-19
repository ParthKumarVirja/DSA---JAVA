import java.util.Queue;

public class CQ {
    static class MyCircularQueue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
    
        public MyCircularQueue(int k) {
            arr = new int[k];
            size = k;
            rear = -1;
            front = -1;
        }
        public boolean isEmpty() {
            return rear==-1 && front==-1;
        }
        
        public boolean isFull() {
            return (rear+1)%size == front;
         }
        
        public void add(int value) {
            if(isFull()) {
                System.out.println("Queue is full" );
                return;
            }
            if(front == -1) { // first element add
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = value;
        }
        
        public int remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            if(rear == front) {  // last element delete
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }
        
        public int peek() {    // Front
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
        
        public int Rear() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[rear];
        }
    
    }
    public static void main(String[] args) {
        
        MyCircularQueue cq = new MyCircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        while(!cq.isEmpty()) {
            System.out.println(cq.peek());
            cq.remove();
        }
     }
}