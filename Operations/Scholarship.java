import java.util.*;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int marks = sc.nextInt();
        System.out.println("Enter your age:");
        System.out.println("Enter your marks:");
       
        if(age >= 18 && age <=26 && marks >= 90) {
            System.out.println("your are eligible for Scholarship");
        }
        else {
            System.out.println("your are not eligible for Scholarship");
        }
        sc.close();
    }
}