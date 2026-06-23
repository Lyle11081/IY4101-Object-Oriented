import java.util.ArrayList;
import java.util.Scanner;
public class ShapeManagement {
    public static void main(String[] args) {
        ShapeList shapeList = new ShapeList(new ArrayList<>());
        Scanner input = new Scanner(System.in);
        //Main Menu
        String menu = "\n ***** Shape Management Application ****** \n";
        menu += "Menu\n";
        menu += "1- Add Shape\n";
        menu += "2- Remove Shape by ID\n";
        menu += "3- Display information by ID\n";
        menu += "4- Translate shape\n";
        menu += "5- Scaling shape\n";
        menu += "6- display all shapes\n";
        menu += "0- Exit\n";
        menu += "Enter your Choice (1 - 6) or 0 to Exit: ";
        //Repeat printing menu and get the user option
        boolean Isdone = true;
        while(true){
            System.out.print(menu);
            String choice = input.next();//get the user choice
            switch(choice){
                case "1":
                    System.out.print("Enter shape type to add: \nC for Circle \nT for Triangle \nS for Square \nR for Rectangle\n: ");
                    char type = input.next().toUpperCase().charAt(0);
                    if(type == 'C'){
                        System.out.print("Please enter X: ");
                        int x = input.nextInt();
                        System.out.print("Please enter Y: ");
                        int y = input.nextInt();
                        System.out.println("Please enter radius: ");
                        double radius = input.nextDouble();
                        shapeList.addShape(new Circle(new Coordinates(x, y), radius));
                        System.out.println("A new Circle created.");
                    }
                    else if(type == 'T'){
                        System.out.print("Please enter 1st vertex(x1,y1): ");
                        Coordinates vertex1 = new Coordinates(input.nextInt(), input.nextInt());
                        System.out.print("Please enter 2nd vertex(x2,y2): ");
                        Coordinates vertex2 = new Coordinates(input.nextInt(), input.nextInt());
                        System.out.print("Please enter 3rd vertex(x3,y3): ");
                        Coordinates vertex3 = new Coordinates(input.nextInt(), input.nextInt());
                        shapeList.addShape(new Triangle(vertex1, vertex2, vertex3));
                        System.out.println("A new Triangle created.");
                    }
                    else if(type == 'S'){
                        System.out.println("Please enter X: ");
                        int x = input.nextInt();
                        System.out.print("Please enter Y: ");
                        int y = input.nextInt();
                        System.out.println("Please enter side value: ");
                        double side = input.nextDouble();
                        shapeList.addShape(new Square(new Coordinates(x, y), side));
                        System.out.println("A new Square created.");
                    }
                    else if(type == 'R'){
                        System.out.println("Please enter X: ");
                        int x = input.nextInt();
                        System.out.print("Please enter Y: ");
                        int y = input.nextInt();
                        System.out.println("Please enter width: ");
                        double width = input.nextDouble();
                        System.out.println("Please enter length: ");
                        double length = input.nextDouble();
                        shapeList.addShape(new Rectangle(new Coordinates(x, y), width, length));
                        System.out.println("A new Rectangle created.");

                    }
                    else{
                        System.out.println("Invalid input, Try again.");
                    }
                    Isdone = false;
                case "2":
                    System.out.print("Enter shape ID you want to remove: ");
                    int id = input.nextInt();
                    if (shapeList.isValid(id)){
                        shapeList.removeShape(id);
                        System.out.print("A shape has been removed.");
                    }
                    else{
                        System.out.print("Invalid Shape ID, Please Try again.");
                    }
                    Isdone = false;
                case "3":
                    System.out.print("Please enter the Shape ID to show the Information: ");
                    id = input.nextInt();
                    System.out.print("-----Shape information by ID----");
                    if(shapeList.isValid(id)){
                        System.out.println(shapeList.getShape(id).Display());
                    }
                    else{
                        System.out.print("Invalid Shape ID, Please Try again.");
                    }
                    Isdone = false;
                case "4":
                    System.out.print("Please enter translate value:");
                    int trans  = input.nextInt();
                    Isdone = false;
                case "5":
                    System.out.print("Please enter scaling value:");
                    int scale = input.nextInt();
                    Isdone = false;
                case "6":
                    System.out.print("---- List of Shapes ----- ");

                    Isdone = false;
                case "0":
                    System.out.print("Exiting Program.....");
                    return;
                default:
                    System.out.print("=------------------------------=");
                    System.out.print("Invalid choice, Please try again.");
                    System.out.print("=------------------------------=");
            }
            }
        }
    }