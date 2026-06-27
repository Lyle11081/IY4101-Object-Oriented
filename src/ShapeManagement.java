import java.util.ArrayList;
import java.util.InputMismatchException;
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
        menu += "6- Display all shapes\n";
        menu += "0- Exit\n";
        menu += "Enter your Choice (1 - 6) or 0 to Exit: ";
        //Repeat printing menu and get the user option
        while (true) {
            System.out.print(menu);
            String choice = input.next();//get the user choice
            switch (choice) {
                case "1":
                    System.out.println("Choice of shapes: \nC for Circle \nT for Triangle \nS for Square \nR for Rectangle");
                    System.out.print("Please enter shape you want to add: ");
                    char type = input.next().toUpperCase().charAt(0);
                    if (type == 'C') {
                        while(true){
                            try {
                                System.out.print("Please enter X: ");
                                int x = input.nextInt();
                                System.out.print("Please enter Y: ");
                                int y = input.nextInt();
                                System.out.print("Please enter radius: ");
                                double radius = input.nextDouble();
                                shapeList.addShape(new Circle(new Coordinates(x, y), radius));
                                System.out.print("A new Circle created.");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("=-------------------------=");
                                System.out.println("Please enter numbers only.");
                                System.out.println("=-------------------------=");
                                input.nextLine();
                            }
                        }
                    } else if (type == 'T') {
                        int x1, x2, x3, y1, y2, y3;
                        while (true){
                            try {
                                System.out.print("Please enter x1: ");
                                x1 = input.nextInt();
                                System.out.print("Please enter y1: ");
                                y1 = input.nextInt();
                                Coordinates vertex1 = new Coordinates(x1, y1);
                                System.out.print("Please enter x2: ");
                                x2 = input.nextInt();
                                System.out.print("Please enter y2: ");
                                y2 = input.nextInt();
                                Coordinates vertex2 = new Coordinates(x2, y2);
                                System.out.print("Please enter x3: ");
                                x3 = input.nextInt();
                                System.out.print("Please enter y3: ");
                                y3 = input.nextInt();
                                Coordinates vertex3 = new Coordinates(x3, y3);
                                shapeList.addShape(new Triangle(vertex1, vertex2, vertex3));
                                System.out.println("A new Triangle created.");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("=-------------------------=");
                                System.out.println("Please enter numbers only.");
                                System.out.println("=-------------------------=");
                                input.nextLine();
                            }
                        }
                    } else if (type == 'S') {
                        while (true){
                            try {
                                System.out.println("Please enter X: ");
                                int x = input.nextInt();
                                System.out.print("Please enter Y: ");
                                int y = input.nextInt();
                                System.out.println("Please enter side value: ");
                                double side = input.nextDouble();
                                shapeList.addShape(new Square(new Coordinates(x, y), side));
                                System.out.println("A new Square created.");
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("=-------------------------=");
                                System.out.println("Please enter numbers only.");
                                System.out.println("=-------------------------=");
                                input.nextLine();
                            }
                        }
                    } else if (type == 'R') {
                        while (true){
                            try {
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
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("=-------------------------=");
                                System.out.println("Please enter numbers only.");
                                System.out.println("=-------------------------=");
                                input.nextLine();
                            }
                        }
                    } else {
                        System.out.print("=------------------------=");
                        System.out.print("\nInvalid input, Try again.\n");
                        System.out.print("=------------------------=");
                    }
                    break;
                case "2":
                    try{
                        System.out.print("Enter shape ID you want to remove: ");
                        int id = input.nextInt();
                        if (shapeList.isValid(id)) {
                            shapeList.removeShape(id);
                            System.out.print("A shape has been removed.");
                        }
                        else {
                            System.out.print("Invalid Shape ID, Please Try again.");
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.print("=------------------------=");
                        System.out.print("\nInvalid Shape ID, Try again.\n");
                        System.out.print("=------------------------=");
                        input.nextLine(); // to clear the invalid input
                    }
                    break;
                case "3":
                    try{
                        System.out.print("Please enter the Shape ID to show the Information: ");
                        int id = input.nextInt();
                        System.out.print("-----Shape information by ID----");
                        if (shapeList.isValid(id)) {
                            System.out.println(shapeList.getShape(id).Display());
                        } else {
                            System.out.print("Invalid Shape ID, Please Try again.");
                        }
                    }catch (InputMismatchException e){
                        System.out.print("=------------------------=");
                        System.out.print("\nInvalid Shape ID, Try again.\n");
                        System.out.print("=------------------------=");
                        input.nextLine(); // to clear the invalid input
                    }
                    break;
                case "4":
                    try {
                        System.out.print("Please enter shape ID to translate:");
                        int id = input.nextInt();
                        if (shapeList.isValid(id)) {
                            System.out.println("Please enter translation value: ");
                            int t = input.nextInt();
                            shapeList.getShape(id).translate(t, t);
                            System.out.print("A shape has been translated.");
                        } else {
                            System.out.print("Invalid shape ID, Please Try again.");
                        }
                    }catch (InputMismatchException e){
                        System.out.print("=------------------------=");
                        System.out.print("\nInvalid Shape ID, Try again.\n");
                        System.out.print("=------------------------=");
                        input.nextLine(); // to clear the invalid input
                    }

                    break;
                case "5":
                    try{
                        System.out.print("Enter Shape ID to rescale: ");
                        int id = input.nextInt();
                        if (shapeList.isValid(id)) {
                            System.out.print("Enter scaling factor: ");
                            int factor = input.nextInt();
                            System.out.print("Please enter M for scale up or D for scale down: ");
                            char res = input.next().toUpperCase().charAt(0);
                            if (res == 'M') {
                                shapeList.getShape(id).scale(factor, true);
                                System.out.println("Shape scaled successfully.");
                            } else if (res == 'D') {
                                shapeList.getShape(id).scale(factor, false);
                                System.out.println("Shape scaled successfully.");
                            } else {
                                System.out.println("Invalid option, Please enter M or D.");
                            }
                        } else {
                            System.out.println("Invalid Shape ID, Please Try again.");
                        }
                    }catch (InputMismatchException e){
                        System.out.print("=------------------------=");
                        System.out.print("\nInvalid Shape ID, Try again.\n");
                        System.out.print("=------------------------=");
                        input.nextLine(); // to clear the invalid input
                    }
                    break;
                case "6":
                    System.out.println("---- List of Shapes ----- ");
                    if (shapeList.size() == 0) {
                        System.out.println("No shapes available.");
                    } else {
                        System.out.println(shapeList.Display());
                    }
                    break;
                case "0":
                    System.out.print("Exiting Program.....");
                    return;
                default:
                    System.out.print("=------------------------------=");
                    System.out.print("\nInvalid choice, Please try again.\n");
                    System.out.print("=------------------------------=");
                    }
            }
        }
    }