import java.util.Scanner;
public class P4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        int h = sc.nextInt();

        if (h<=0)
        {
            System.out.println("Error");
            System.exit(0);
        }

        String str = "BBAA";

        System.out.println("AA");

        for(int i=2; i<=h; i++)
        {
            int count = i/2;
            if(i%2 == 0)   //even numbered line
            {
                System.out.println(str.repeat(count));
            }
            else
            {
                System.out.print("AA");
                System.out.println(str.repeat(count));
            }
        }
        sc.close();
    }
}
