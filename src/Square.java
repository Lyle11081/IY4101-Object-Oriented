public class Square extends Shape{
    //properties
    private double length;
    //Constructor
    public Square(Coordinates coord, double width){
        super(2, coord);// Square has 2 sides with same length
        this.length = length;
    }
    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            this.length *= factor;
        }
        else {
            this.length /= factor;
        }
    }
    @Override
    public double getPerimeter() {return  length * 4;}

    @Override
    public double getArea() {return length * length;}

    @Override
    public String Display() {
        return "Rectangle at " + position.Display() + ", length: " + length;}
}
