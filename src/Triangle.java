    public class Triangle extends Shape {
    //Properties
    private Coordinates vertex1;
    private Coordinates vertex2;
    private Coordinates vertex3;
    double a = vertex1.distance(vertex2);
    double b = vertex2.distance(vertex3);
    double c = vertex3.distance(vertex1);
    //Constructor
    public Triangle(Coordinates vertex1, Coordinates vertex2, Coordinates vertex3) {
        super(3, vertex1);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
    public void translate(int dx, int dy) {
        this.vertex1.translate(dx,dy);
        this.vertex2.translate(dx,dy);
        this.vertex3.translate(dx,dy);
    }
    @Override
    public void scale(int factor, boolean sign) {
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public double getArea(){
        double s, Area;
        s = (a + b + c) / 2;
        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if(Area == 0){
            System.out.print("Not a Triangle.");
            return 0;
        }
        else {
            return Area;
        }
    }
    @Override
    public String Display() {
        return "Triangle at" + position.Display() +
                "Perimeter: \n" + getPerimeter() + " Area: " + getArea();
    }
}