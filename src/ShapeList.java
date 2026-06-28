import java.util.ArrayList;
public class ShapeList{
    private ArrayList<Shape> listOfShapes;
    public ShapeList(ArrayList<Shape> listOfShapes) {
        this.listOfShapes = new ArrayList<>();
    }
    public void addShape(Shape s) {
        listOfShapes.add(s);
    }
    public void translateShapes(int dx, int dy) {
        for (Shape each : listOfShapes) {
            each.translate(dx, dy);
        }
    }
    public Shape getShape(int id) {
        return listOfShapes.get(id - 1);
    }
    public Shape removeShape(int id) {
        return listOfShapes.remove(id - 1);
    }
    public void scale(int factor, boolean sign) {
        for (Shape each : listOfShapes) {
            each.scale(factor, sign);
        }
    }
    public String Display() {
        StringBuilder displayString = new StringBuilder();
        int id = 1;
        for (Shape each : listOfShapes) {
            displayString.append("\nShape ID : ").append(id).append("\n");
            displayString.append(each.Display()).append("\n");
            id++;
        }
        return displayString.toString();
    }
    public int size() {
        return listOfShapes.size();
    }
    public boolean isValid(int id) {
        return id > 0 && id <= listOfShapes.size();
    }
}