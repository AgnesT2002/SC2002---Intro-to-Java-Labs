package part2;

public class Circle implements Shape {
    
    static double PI = 3.142;
    private double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double calArea()
    {
        return PI * Math.pow(radius, 2);
    }

}
