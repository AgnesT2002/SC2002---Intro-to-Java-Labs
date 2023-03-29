import java.util.Scanner;
import java.util.Random;
public class Lab2p1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int choice;
        // Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            int n, m, ans;
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.println("Please enter 2 integers: (first second)");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    if (n==0) 
                    {
                        System.out.println("Denominator cannot be 0! Try again.");
                        break;
                    }
                    ans = divide(m,n);
                    System.out.println(m + " / " + n + " = " + ans);
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Please enter 2 integers: (first second)");
                    m = sc.nextInt();
                    n = sc.nextInt();
                    if (n==0) 
                    {
                        System.out.println("Denominator cannot be 0! Try again.");
                        break;
                    }
                    ans = modulus(m,n);
                    System.out.println(m + " % " + n + " = " + ans);
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Please enter a positive integer");
                    n = sc.nextInt();
                    if (n <= 0) 
                    {
                        System.out.println("Error input!!");
                        break;
                    }
                    System.out.println("count = " + countDigits(n));
                    break;
                case 5: /* add position() call */
                    System.out.println("Please enter a positive integer and the digit to be found");
                    n = sc.nextInt();
                    int digit = sc.nextInt();
                    System.out.println("position = " + position(n, digit));
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("Please enter a positive integer");
                    n = sc.nextInt();
                    if (n <= 0) 
                    {
                        System.out.println("Error input!!");
                        break;
                    }
                    System.out.println("oddDigits = " + extractOddDigits(n));
                    break;
                case 7: System.out.println("Program terminating");
            }
        } while (choice < 7);
        sc.close();
    }

    /* add method code here */
    public static void mulTest()
    {
        int correct = 0;
        for (int i=0; i<5; i++)
        {
            Random random = new Random();
            int a = 0;
            while (true)
            {
                a = random.nextInt(11);
                if(a !=0) break;
            }

            int b = 0;
            while (true)
            {
                b = random.nextInt(11);
                if(b !=0) break;
            }
            int ans = a*b;

            System.out.println("How much is " + a +" times " + b + "?");
            // Scanner sc = new Scanner(System.in);
            int inpt = sc.nextInt();
            // sc.close();

            if (inpt == ans) correct++;
        }
        System.out.println(correct + " answers out of 5 are correct.");
    }

    public static int divide(int m, int n)
    {
        if (n>m) return 0;

        int quo = 0;
        while (m>=n)
        {
            m -= n;
            quo++;
        }
        return quo;
    }

    public static int modulus(int m, int n)
    {
        while (m>=n) m -= n;
        return m;
    }

    public static int countDigits(int n)
    {
        int len = 0;
        do
        {
            n = divide(n, 10);
            len++;
        }
        while(n>0);

        return len;
    }

    public static int position(int n, int digit)
    {
        int pos = 0;
        while(n != 0)
        {
            pos++;
            if (modulus(n, 10) == digit)
                return pos;
            n = divide(n, 10);
        }
        return -1;
    }
    
    public static long extractOddDigits(long n)
    {
        long newInt = 0;
        int count = 1;
        while(n!=0)
        {
            long check = n % 10;
            if (check % 2 == 1)
            {
                newInt += check*count;
                count*=10;
            }
            n = divide((int) n, 10);
        }
        if(newInt == 0) return -1;
        return newInt;
    }
}