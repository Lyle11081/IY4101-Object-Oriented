public class Rectangle extends Shape{
    //properties
    private double length;
    private double width;
    //Constructor
    public Rectangle(Coordinates coord,double length, double width){
        super(2, coord);// Rectangle has 2 sides
        this.length = length;
        this.width = width;
    }
    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            this.length *= factor;
            this.width *= factor;
        }
        else {
            this.length /= factor;
            this.width /= factor;
        }
    }
    @Override
    public double getPerimeter() {
        return  width + length;
    }

    @Override
    public double getArea() {return width * length;}

    @Override
    public String Display() {
        return "Rectangle at " + position.Display() + ", width: " + width + ", lenght: " + length;}
}
