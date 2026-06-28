    public class Triangle extends Shape {
    //Properties
    private Coordinates vertex1;
    private Coordinates vertex2;
    private Coordinates vertex3;
    double a;
    double b;
    double c;
    //Constructor
    public Triangle(Coordinates vertex1, Coordinates vertex2, Coordinates vertex3) {
        super(3, vertex1);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
        a = vertex1.distance(this.vertex2);
        b = vertex2.distance(this.vertex3);
        c = vertex3.distance(this.vertex1);
    }

    public void translate(int dx, int dy) {
        this.vertex1.translate(dx,dy);
        this.vertex2.translate(dx,dy);
        this.vertex3.translate(dx,dy);
    }
        @Override
    public void scale(int factor, boolean sign) {
        vertex1.scale(factor,sign);
        vertex2.scale(factor,sign);
        vertex3.scale(factor,sign);
    }
    @Override
    public double getPerimeter() {
        //--- Update sides after translated or rescaled ---
        a = vertex1.distance(vertex2);
        b = vertex2.distance(vertex3);
        c = vertex3.distance(vertex1);
        return a + b + c;
    }
    @Override
    public double getArea(){
        double s, Area;
        //--- Update sides after translated or rescaled ---
        a = vertex1.distance(vertex2);
        b = vertex2.distance(vertex3);
        c = vertex3.distance(vertex1);
        //Calculate Area
        s = (a + b + c) / 2;
        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        if(Area == 0){
            System.out.print("Not a Triangle\n");
            return 0;
        }
        else {
            return Area;
        }
    }
    @Override
    public String Display() {
        return "Triangle at " + position.Display() +
                "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
}