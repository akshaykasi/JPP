class Student {
    String name;
    int age;
    long rollnumber;

    void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Roll Number" + rollnumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Akshay Kasi";
        s1.age = 21;
        s1.rollnumber = 2411030010214L;

        s1.displayDetails();

    }
}