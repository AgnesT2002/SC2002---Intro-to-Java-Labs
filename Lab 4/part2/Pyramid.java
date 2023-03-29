package part2;

public class Pyramid implements Shape3D {
    
    static double PI = 3.142;
    private double baselength;
    private double height;
    
    public Pyramid(double baselength, double height)
    {
        this.baselength = baselength;
        this.height = height;
    }

    public double calArea()
    {
        Triangle tri = new Triangle(baselength, height);
        return (baselength*baselength) + 3 * tri.calArea();
    }

    public double calVolume()
    {
        return 1/3 * (baselength*baselength) * height;
    }
}
