public class Square extends Shape{
    //properties
    private double side;
    //Constructor
    public Square(Coordinates coord, double side){
        super(4, coord);// Square has 2 sides with same length
        this.side = side;
    }
    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            this.side *= factor;
        }
        else {
            this.side /= factor;
        }
    }
    @Override
    public double getPerimeter() {return  side * 4;}

    @Override
    public double getArea() {return side * side;}

    @Override
    public String Display() {
        return "Rectangle at " + position.Display() + ", Side: \n" + side
                + "Perimeter: \n" + getPerimeter() + " Area: " + getArea();}
}
