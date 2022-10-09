//Robert Bennethum
class Circle implements Shape
{
    double radius;

    Circle(double rad)
    { radius=rad; }

    void setRadius(double rad)
    { radius=rad; }

    double getRadius()
    { return radius; }

    public double area()
    { return(Math.PI * radius * radius); }

}