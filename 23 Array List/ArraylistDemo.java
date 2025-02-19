import java.util.ArrayList;
import java.util.Collections;

class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);;
        
        //get element
        int ele = list.get(1);
        System.out.println(ele);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());
        System.out.println();

        //loops/iterate
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}