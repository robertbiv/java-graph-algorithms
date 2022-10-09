//Robert Bennethum
class Rectangle implements Shape
{
    double length, width;

    Rectangle(double l, double w)
    {
        length=l;
        width=w;
    }

    void setLength(double l)
    { length=l; }

    void setWidth(double w)
    { width=w; }

    double getLength()
    { return length; }

    double getWidth()
    { return width; }

    public double area()
    { return(length*width); }
}