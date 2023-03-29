import java.util.Scanner;
public class P2 
{
    public static void main(String[] args)
    {
        int salary, points;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary:");
        salary = sc.nextInt();
        System.out.println("Enter points:");
        points = sc.nextInt();

        if (salary>=700)
        {
            if(salary<=799 && points<20)
                System.out.println("Grade B");
            else 
                System.out.println("Grade A");
        }

        else if (salary>=600)
        {
            if(salary<=649 && points<10)
                System.out.println("Grade C");
            else 
                System.out.println("Grade B");
        }
        else 
            System.out.println("Grade C");

        sc.close();
    }
}
