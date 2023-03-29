package part2;

public class Cylinder implements Shape3D {
    
    static double PI = 3.142;
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public double calArea()
    {
        Circle base = new Circle(radius);
        Rectangle body = new Rectangle(height, 2*PI*radius);
        
        return 2*base.calArea() + body.calArea();
    }

    public double calVolume()
    {
        Circle base = new Circle(radius);
        return base.calArea() * height;
    }
}
