package part2;

public class Sphere implements Shape3D {
    
    static double PI = 3.142;
    private double radius;
    
    public Sphere(double radius)
    {
        this.radius = radius;
    }

    public double calArea()
    {
        return 4 * PI * Math.pow(radius, 2);
    }

    public double calVolume()
    {
        return 4/3 * PI * Math.pow(radius, 3);
    }
}
