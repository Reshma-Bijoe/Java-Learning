import java.util.*;
public class StuInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String dept=sc.nextLine();
        String clg=sc.nextLine();
        float cgpa=sc.nextFloat();
        System.out.println("Name : "+n);
        System.out.println("Age : "+age);
        System.out.println("Department : "+dept);
        System.out.println("college : "+clg);
        System.out.println("cgpa : "+cgpa);
    }
}
