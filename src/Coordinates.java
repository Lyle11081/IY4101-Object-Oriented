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
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    // Make it Bigger or smaller
    public void scale(int factor, boolean sign){
        if (sign){
            this.x *= factor;
            this.y *= factor;
        } else{
            this.x /= factor;
            this.y /= factor;
        }
    }
    // Display Coordinate
    public String Display() {
        return String.format("(%d,%d)", x, y);
    }
}