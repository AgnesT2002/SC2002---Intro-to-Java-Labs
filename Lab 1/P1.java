//Write a program that reads a character from the user and then uses a switch statement to print out specific lines
import java.util.Scanner;
public class P1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter (A, C or D): ");
        char choice = sc.next().charAt(0);

        if ((choice == 'A') || (choice == 'a'))
            System.out.println("Action movie fan");

        else if ((choice == 'C') || (choice == 'c'))
            System.out.println("Comedy movie fan");

        else if ((choice == 'D') || (choice == 'd'))
            System.out.println("Drama movie fan");

        else
            System.out.println("Invalid Choice");

        sc.close();
    }
}