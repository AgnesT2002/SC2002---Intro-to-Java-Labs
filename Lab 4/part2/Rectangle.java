package part2;

public class Rectangle implements Shape {
    
    double height;
    double width;
    
    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public double calArea()
    {
        return height*width;
    }

}
