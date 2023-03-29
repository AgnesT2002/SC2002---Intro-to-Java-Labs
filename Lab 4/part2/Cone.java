package part2;

public class Cone implements Shape3D {
    
    static double PI = 3.142;
    private double baseradius;
    private double height;
    
    public Cone(double baseradius, double height)
    {
        this.baseradius = baseradius;
        this.height = height;
    }

    public double calArea()
    {
        Circle base = new Circle(baseradius);
        double rest = PI * baseradius * Math.pow((height*height + baseradius*baseradius), 0.5);

        return base.calArea() + rest;
    }

    public double calVolume()
    {
        return 1/3 * PI * (baseradius*baseradius) * height;
    }
}
