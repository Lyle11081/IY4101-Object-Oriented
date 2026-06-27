public class Square extends Shape{
    //properties
    private double side;
    //Constructor
    public Square(Coordinates coord, double side){
        super(4, coord);// Square has 4 sides with same length
        this.side = side;
    }
    @Override
    public void scale(int factor, boolean sign) {
        position.scale(factor, sign);
        if (sign) {
            this.side *= factor;
        }
        else {
            this.side /= factor;
        }
    }
    @Override
    public double getPerimeter() {
        double perimeter = side * 4;
        if (perimeter == 0) {
            System.out.print("No perimeter\n");
            return 0;
        } else {
            return perimeter;
        }
    }
    @Override
    public double getArea() {
        double Area = side * side;
        if(Area == 0){
            System.out.print("Not a Square\n");
            return 0;
        }else {
            return Area;}
        }
    @Override
    public String Display() {
        return "Square at " + position.Display() + "\nSide: " + side
                + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();}
}
