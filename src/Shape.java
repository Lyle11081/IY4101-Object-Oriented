public abstract class Shape {
    protected Coordinates position;
    protected int sides;
    public Shape(int noOfSides, Coordinates coord) {
        this.position = coord;
        this.sides = noOfSides;
    }
    // get and set Coordinates
    public Coordinates getCoordinates (){ return this.position;}
    public  void setCoordinates (Coordinates newcoord){ this.position = newcoord;}
    // set sides
    public int getSides (){ return this.sides;}
    public void translate(int dx, int dy) {
        this.position.setX(this.position.getX() + dx);
        this.position.setY(this.position.getY() + dy);
    }
    public void scale(int factor, boolean sign) {}
    public double getArea() {
        return 0; // change this later ??
    }
    public double getPerimeter() {
        return 0; // change this later ??
    }
    public String Display(){
        return "??";
    }
}