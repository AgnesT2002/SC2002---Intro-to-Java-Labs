package part2;
import java.util.Scanner;

public class Shape2DApp {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of shapes:");
        int n = sc.nextInt();

        Shape[] shapes = new Shape[n];

        System.out.println("1. Square \n2. Rectangle \n3. Circle \n4. Triangle");

        int s, l, h, r, w, b;
        for (int i=0; i<n; i++)
        {
            do
            {
                System.out.println("Choose shape " + (i+1));
                s = sc.nextInt();

                switch(s)
                {
                    case 1: 
                        System.out.println("Enter length of square:");
                        l = sc.nextInt();
                        shapes[i] = new Square(l);
                        break;

                    case 2: 
                        System.out.println("Enter height and width of rectangle:");
                        h = sc.nextInt();
                        w = sc.nextInt();
                        shapes[i] = new Rectangle(h, w);
                        break;

                    case 3: 
                        System.out.println("Enter radius of circle:");
                        r = sc.nextInt();
                        shapes[i] = new Circle(r);
                        break;
                    
                    case 4: 
                        System.out.println("Enter height and base of triangle:");
                        h = sc.nextInt();
                        b = sc.nextInt();
                        shapes[i] = new Triangle(h, b);
                        break;

                    default:
                        s = 0;
                }

            } while(s==0);
        }

        int choice;
        do
        {
            System.out.println("Choose next action: 1 to calculate area, 2 to end program");
            choice = sc.nextInt();

            double totalArea = 0.0;
            switch(choice)
            {
                case 1:
                    for (int i=0; i<n; i++)
                    {
                        totalArea += shapes[i].calArea();
                    }
                    System.out.println("The area of your 2D figure is " + totalArea);
                    choice = 0;
                    break;

                case 2:
                    System.out.println("End of Program");
                    break;

                default:
                    choice = 0;
            }
        } while (choice == 0);

        sc.close();
    }
}
