
public class LinkedList{
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void print() {
        if(head == null) {
            System.out.println("LL is Empty !");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;   //prev : i = size-2
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;   // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int remove(int idx) {
        if(idx == 0) {
            return removeFirst();
        } else if(size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        
        size--;
        return val;

    }

    public Node removeNthFromEnd(Node head, int n) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        if(n == size) { //remove first node
            return head.next;
        }
        // size - n 
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) {
            return true;
        }
        // find mid node
        Node mid = findMid(head);
        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;
        //compare left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }
        //find cycle/meeting point
        slow = head;
        Node prev = null; // last node
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle : lastNode.next = null
        prev.next = null;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        //find mid 
        Node mid = getMid(head);
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null; //break ll in two parts
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft, newRight);
     }
     private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;  // for : mid is last node of 1st Half
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
     }
     private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
     }

     public Node deleteMiddle(Node head) {

        if (head == null || head.next == null) {
             return null;
         }
 
         // Initialize the two pointers
         Node slow = head;
         Node fast = head;
         Node prev = null; // To keep track of the node before slow
 
         // Use the two-pointer technique to find the middle node
         while (fast != null && fast.next != null) {
             prev = slow;
             slow = slow.next;
             fast = fast.next.next;
         }
 
         // prev is now the node before the middle node, and slow is the middle node
         if (prev != null) {
             prev.next = slow.next; // Remove the middle node
         }
 
         return head;
     }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
        ll.addLast(7);
        ll.print();
        ll.add(1,9);
        // ll.print();
        // ll.removeLast();
        ll.print();
        // System.out.println(ll.size);
        // ll.print();
        Node head = ll.removeNthFromEnd(ll.head, 2);
        ll.print();

        ll.head = ll.reverseList(ll.head);
        ll.print();
        ll.addFirst(9);
        ll.print();
        // System.out.println(ll.isPalindrome(ll.head));
        System.out.println(ll.hasCycle(ll.head));
        ll.print();

        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
 }



