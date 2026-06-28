public class Coordinates {
    //properties
    private int x;
    private int y;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Set and Get X,Y
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    //Calculate Distance Between points
    public double distance(Coordinates p) {
        return Math.sqrt(Math.pow(getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2));
    }
    public void translate(int dx, int dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }
    // Make it Bigger or smaller
    public void scale(int factor, boolean sign){
        if (sign) {
            setX(getX() * factor);
            setY(getY() * factor);
        }
        else {
            setX(getX() / factor);
            setY(getY() / factor);
        }
    }
    // Display Coordinate
    public String Display() {
        return String.format("(%d,%d)", getX(), getY());
    }
}