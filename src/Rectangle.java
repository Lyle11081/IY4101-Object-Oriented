public class Rectangle extends Shape{
    //properties
    private double length;
    private double width;
    //Constructor
    public Rectangle(Coordinates coord,double length, double width){
        super(4, coord);// Rectangle has 2 sides
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
        double perimeter = (width*2) + (length*2);
        if(perimeter == 0){
            System.out.print("Not a Rectangle\n");
            return 0;
        } else if (width == 0 || length == 0) {
            System.out.print("Not a Rectangle\n");
            return  perimeter;
        }else {
            return perimeter;
        }
    }

    @Override
    public double getArea() {return width * length;}

    @Override
    public String Display() {
        return "Rectangle at " + position.Display() + "\nwidth: " + width + "\nlength: " + length
              + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea()  ;}
}
