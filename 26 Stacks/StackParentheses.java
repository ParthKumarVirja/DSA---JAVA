import java.util.Stack;

public class StackParentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);  // opening
            } else {
                // only closing
                if(s.isEmpty()) {
                    return false;
                }
                if( (s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']') ) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isDuplicate(String str) { // O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //closing
            if(ch == ')') {
                int count = 0;
                while(s.pop() != '(') {
                    count++;
                }
                if(count<1){
                    return true; // duplicate exists
                }
            } else { // opening
                s.push(ch); 
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "({[]})";  //t
        String str2 = "[][{])"; //f
        System.out.println(isValid(str2));

        String st = "((a+b))"; //t
        String st2 = "(a-b)";  //f
        System.out.println(isDuplicate(st2));
    }
}