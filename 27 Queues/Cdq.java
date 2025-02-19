public class Cdq {
    static class MyCircularDeque {

        private int[] arr;
         private int front;
         private int rear;
         private int size;
         private int capacity;
     
         public MyCircularDeque(int k) {
             capacity = k;
             arr = new int[capacity];
             front = -1;
             rear = -1;
             size = 0;
         }
     
         public boolean addFront(int value) {
             if (isFull()) {
                 return false;
             }
             if (isEmpty()) {
                 front = 0;
                 rear = 0;
             } else {
                 front = (front - 1 + capacity) % capacity;
             }
             arr[front] = value;
             size++;
             return true;
         }
     
         public boolean addLast(int value) {
             if (isFull()) {
                 return false;
             }
             if (isEmpty()) {
                 front = 0;
                 rear = 0;
             } else {
                 rear = (rear + 1) % capacity;
             }
             arr[rear] = value;
             size++;
             return true;
         }
     
         public boolean removeFront() {
             if (isEmpty()) {
                 return false;
             }
             if (front == rear) {
                 front = -1;
                 rear = -1;
             } else {
                 front = (front + 1) % capacity;
             }
             size--;
             return true;
         }
     
         public boolean removeLast() {
             if (isEmpty()) {
                 return false;
             }
             if (front == rear) {
                 front = -1;
                 rear = -1;
             } else {
                 rear = (rear - 1 + capacity) % capacity;
             }
             size--;
             return true;
         }
     
         public int getFront() {
             if (isEmpty()) {
                 return -1;
             }
             return arr[front];
         }
     
         public int getRear() {
             if (isEmpty()) {
                 return -1;
             }
             return arr[rear];
         }
     
         public boolean isEmpty() {
             return size == 0;
         }
     
         public boolean isFull() {
             return size == capacity;
         }
     }
      
     public static void main(String[] args) {

        MyCircularDeque cq = new MyCircularDeque(5);
        cq.addLast(1);
        cq.addFront(2);
        cq.addFront(3);
        while(!cq.isEmpty()) {
            System.out.println(cq.getFront());
            cq.removeFront();
        }
     }
      
}
