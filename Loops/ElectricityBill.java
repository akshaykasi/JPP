import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units = sc.nextInt();
        double bill = 0;
        if (0 <= units && units <= 100) {
            bill = units * 2;
            System.out.println("The electricity bill is " + bill);
        }
        else if (101 <= units && units <= 200) {
            bill = units * 3;
            System.out.println("The electricity bill is " + bill);

        } 
        else if (201 <= units && units <= 300) {
            bill = units * 6; 
            System.out.println("The electricity bill is" + bill);
            }
         else {
            bill = units * 7;
            System.out.println("The electricity bill is " + bill );  

        }
        sc.close();
    }
}