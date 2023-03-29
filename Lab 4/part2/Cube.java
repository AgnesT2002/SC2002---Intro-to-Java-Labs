package part2;

public class Cube implements Shape3D {
    
    private double length;
    
    public Cube(double length)
    {
        this.length = length;
    }

    public double calArea()
    {
        Square side = new Square(length);

        return 6 * side.calArea();
    }

    public double calVolume()
    {
        return Math.pow(length, 3);
    }
}
