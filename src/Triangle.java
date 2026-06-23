public class Triangle extends Shape {
    //Properties
    private double a;
    private double b;
    private double c;
    //Constructor
    public Triangle(Coordinates coord, double a, double b, double c) {
        super(3, coord); // Triangle has 3 sides
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            this.a *= factor;
            this.b *= factor;
            this.c *= factor;
        } else {
            this.a /= factor;
            this.b /= factor;
            this.c /= factor;
        }
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public double getArea(){
        double s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public String Display() {
        return "Triangle at" + position.Display();
    }
}