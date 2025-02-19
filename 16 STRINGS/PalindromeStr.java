public class PalindromeStr {

    public static void main(String[] args) {
        PalindromeStr tester = new PalindromeStr();
        
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "";
        String test4 = " ";
        String test5 = "0P";
        
        System.out.println("Test 1: " + tester.isPalindrome(test1)); // should return true
        System.out.println("Test 2: " + tester.isPalindrome(test2)); // should return false
        System.out.println("Test 3: " + tester.isPalindrome(test3)); // should return true
        System.out.println("Test 4: " + tester.isPalindrome(test4)); // should return true
        System.out.println("Test 5: " + tester.isPalindrome(test5)); // should return false
    }

    public boolean isPalindrome(String s) {
    // Step 1: Preprocess the input string
    StringBuilder cstr = new StringBuilder();
    
    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            cstr.append(Character.toLowerCase(c));
        }
    }
    
    // Step 2: Check if the cleaned string is a palindrome
    String pstr = cstr.toString();
    
    int length = pstr.length();
    for (int i = 0; i < length / 2; i++) {
        if (pstr.charAt(i) != pstr.charAt(length - 1 - i)) {
            return false;
        }
    }
    
    return true;
    }
}