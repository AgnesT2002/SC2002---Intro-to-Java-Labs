import java.util.Scanner;
public class P3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start value:");
        int start = sc.nextInt();
        System.out.println("Enter end value:");
        int end = sc.nextInt();
        System.out.println("Enter increment value:");
        int inc = sc.nextInt();
        sc.close();

        //error cases
        if (start>end || inc>end || start<=0 || end<=0 || inc<=0)
        {
            System.out.println("Error");
            System.exit(0);
        }

        int i;

        //for loop
        System.out.println("Using For Loop");
        System.out.println("US$\t\tS$");
        System.out.println("--------------------");

        for(i=start; i<=end; i+=inc)
        {
            System.out.println(i + "\t\t" + i*1.82);
        }

        //while loop
        System.out.println("Using While Loop");
        System.out.println("US$\t\tS$");
        System.out.println("--------------------");

        i = start;
        while(i <= end)
        {
            System.out.println(i + "\t\t" + i*1.82);
            i += inc;
        }

        //do-while loop
        System.out.println("Using Do-While Loop");
        System.out.println("US$\t\tS$");
        System.out.println("--------------------");

        i = start;
        do
        {
            System.out.println(i + "\t\t" + i*1.82);
            i += inc;
        }
        while(i<=end);

    }
}
