public abstract class Shape {
    private Coordinates position;
    private int sides;
    public Shape(int noOfSides, Coordinates coord) {
        this.position = coord;
        this.sides = noOfSides;
    }
    public Coordinates getCoordinates (){ return this.position;}
    public int getSides (){ return this.sides;}
    public  void setCoordinates (Coordinates newcoord){ this.position = newcoord;}
    public void translate(int dx, int dy) {
        this.position.setX(this.position.getX() + dx);
        this.position.setY(this.position.getY() + dy);
    }
    public void scale(int factor, boolean sign) {}
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
    public String Display(){
        return "??";
    }
}