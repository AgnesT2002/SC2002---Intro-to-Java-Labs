package part2;

public class Cuboid implements Shape3D {
    
    private double length;
    private double width;
    private double height;
    
    public Cuboid(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calArea()
    {
        Rectangle base = new Rectangle(length, width);
        Rectangle body1 = new Rectangle(length, height);
        Rectangle body2 = new Rectangle(width, height);

        return 2*base.calArea() + 2*body1.calArea() + 2*body2.calArea();
    }

    public double calVolume()
    {
        Rectangle base = new Rectangle(length, width);
        return base.calArea() * height;
    }
}
