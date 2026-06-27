public class Circle extends Shape {
    //properties
    private double radius;
    // Constructor
    public Circle(Coordinates coord, double radius) {
        super(0, coord); // A circle has no sides
        this.radius = radius;
    }
    @Override
    public void scale(int factor, boolean sign) {
        position.scale(factor, sign);
        if (sign) {
            this.radius *= factor;
        } else {
            this.radius /= factor;
        }
    }
    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        if (perimeter == 0) {
            System.out.print("No Perimeter\n");
            return 0;
        } else {
            return perimeter;
        }
    }

    @Override
    public double getArea() {
        double Area = Math.PI * this.radius * this.radius;
        if (Area == 0) {
            System.out.print("Not a Circle \n");
        }
            return Area;
    }
    @Override
    public String Display() {return "Circle at " + position.Display() + "\nRadius: "
            + radius + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();}
    }