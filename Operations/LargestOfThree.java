import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Enter num1:");
        System.out.println("Enter num2:");
        System.out.println("Enter num3:");

        if(num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is num1 :" +num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The Largest number is num2 : " + num2);
        }
        else {
            System.out.println("The largest number is number 3 : " + num3);
        }
         sc.close();
    }
}
