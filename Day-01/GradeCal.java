import java.util.*;
public class GradeCal {
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int mat=sc.nextInt();
    int sci=sc.nextInt();
    int eng=sc.nextInt();
    int sum=mat+sci+eng;
    int avg=sum/3;
    String Grade = "";
    if(avg>=90)
    {
        Grade = "A";
    }
    else if(avg>=80)
    {
        Grade = "B";
    }
    else if(avg>=70)
    {
        Grade = "C";
    }
    else if(avg>=60)
    {
        Grade = "D";
    }
    else
    {
        Grade = "F";
    }
    System.out.println("Sum : "+sum);
    System.out.println("Average : "+avg);
    System.out.println("Grade : "+ Grade);
}
}
