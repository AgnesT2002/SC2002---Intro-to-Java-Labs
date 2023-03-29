package part2;

public class Square implements Shape {
    
    double length;
    
    public Square(double length)
    {
        this.length = length;
    }

    public double calArea()
    {
        return length*length;
    }

}
