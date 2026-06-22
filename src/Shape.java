public abstract class Shape {
    //Properties
    protected Coordinates position;
    protected int sides;
    //Constructor
    public Shape(int noOfSides, Coordinates coord) {
        this.position = coord;
        this.sides = noOfSides;
    }
    // Get Coordinates
    public Coordinates getCoordinates() {
        return this.position;
    }
    // Set coordinates
    public void setCoordinates(Coordinates newcoord) {
        this.position = newcoord;
    }
    // Get sides
    public int getSides() {
        return this.sides;
    }
    // Translate the shape
    public void translate(int dx, int dy) {
        this.position.setX(this.position.getX() + dx);
        this.position.setY(this.position.getY() + dy);
    }
    // Abstract methods (must be implemented by sub-classes)
    public abstract void scale(int factor, boolean sign);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String Display();
}