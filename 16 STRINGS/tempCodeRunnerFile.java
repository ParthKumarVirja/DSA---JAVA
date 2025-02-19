import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name :");
        String name = sc.next();
        System.out.println("Enter your full name : ");
        String fName = sc.nextLine();
        System.out.println("name : "+name+" , full name : "+fName);

        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName);
        System.out.println("Length of fullName : " + fullName.length());

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
