package exRectangle;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length)
    {
        this.width=width;
        this.length=length;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getWidth()
    {
        return width;
    }

    public void setLength(double length)
    {
        this.length=length;
    }

    public double getLength()
    {
        return length;
    }

    public double aria()
    {
        return width*length;
    }

    public double perimetru()
    {
        return 2*(width+length);
    }
}
