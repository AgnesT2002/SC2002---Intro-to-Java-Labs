package part2;
import java.util.Scanner;

public class Shape3DApp {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of shapes:");
        int n = sc.nextInt();

        Shape3D[] shapes = new Shape3D[n];

        System.out.println("1. Cube \n2. Cuboid \n3. Sphere \n4. Pyramid \n5. Cone \n6.Cylinder");

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
                        System.out.println("Enter length:");
                        l = sc.nextInt();
                        shapes[i] = new Cube(l);
                        break;

                    case 2: 
                        System.out.println("Enter length, width and height of cuboid:");
                        l = sc.nextInt();
                        w = sc.nextInt();
                        h = sc.nextInt();
                        shapes[i] = new Cuboid(l, w, h);
                        break;

                    case 3: 
                        System.out.println("Enter radius of sphere:");
                        r = sc.nextInt();
                        shapes[i] = new Sphere(r);
                        break;
                    
                    case 4: 
                        System.out.println("Enter base length and height of pyramid:");
                        b = sc.nextInt();
                        h = sc.nextInt();
                        shapes[i] = new Pyramid(b, h);
                        break;

                    case 5: 
                        System.out.println("Enter base radius and height of cone:");
                        r = sc.nextInt();
                        h = sc.nextInt();
                        shapes[i] = new Cone(r, h);
                        break;

                    case 6: 
                        System.out.println("Enter base radius and height of cylinder:");
                        r = sc.nextInt();
                        h = sc.nextInt();
                        shapes[i] = new Cylinder(r, h);
                        break;

                    default:
                        s = 0;
                }

            } while(s==0);
        }

        int choice;
        do
        {
            System.out.println("Choose next action: 1 to calculate area, 2 to calculate volume, 3 to end program");
            choice = sc.nextInt();

            double totalArea = 0.0, totalVolume = 0.0;
            switch(choice)
            {
                case 1:
                    for (int i=0; i<n; i++)
                    {
                        totalArea += shapes[i].calArea();
                    }
                    System.out.println("The area of your 3D figure is " + totalArea);
                    choice = 0;
                    break;

                case 2:
                    for (int i=0; i<n; i++)
                    {
                        totalVolume += shapes[i].calVolume();
                    }
                    System.out.println("The volume of your 3D figure is " + totalVolume);
                    choice = 0;
                    break;

                case 3:
                    System.out.println("End of Program");
                    break;

                default:
                    choice = 0;
            }
        } while (choice == 0);

        sc.close();
    }
}
