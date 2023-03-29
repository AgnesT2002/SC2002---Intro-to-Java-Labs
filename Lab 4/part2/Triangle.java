package part2;

public class Triangle implements Shape {
    
    double height;
    double base;
    
    public Triangle(double height, double base)
    {
        this.height = height;
        this.base = base;
    }

    public double calArea()
    {
        return 0.5*height*base;
    }

}
