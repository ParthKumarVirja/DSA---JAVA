import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name : ");
        String fName = sc.nextLine();
        System.out.println("Your full name : "+fName);

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);
        System.out.println("Length of fullName : " + fullName.length());

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        // compare Strings :
        if (fName.compareTo(fullName) == 0){
            System.out.println("Both Strings are Equal");
        }else {
            System.out.println("Both are not equal.");
        }

        // equal string 
        String str = "stark";
        if (lastName.equals(str)) {
            System.out.println("Last name is qual to Str. ");
        }else {
            System.out.println("String str not Equal to String lastName. ");
        }

        // find  substring 
        String name1 = "My name is Tony Stark";
        System.out.println("Only name : "+ name1.substring(11,15));
        System.out.println("Full name only : "+name1.substring(11));
    }
}
