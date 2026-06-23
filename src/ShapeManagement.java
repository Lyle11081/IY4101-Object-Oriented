import java.util.ArrayList;
import java.util.Scanner;
public class ShapeManagement {
    public static void main(String[] args) {
        ShapeList shapeList = new ShapeList(new ArrayList<>());
        Scanner input = new Scanner(System.in);
        //String Menu
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
        while(true){
            System.out.print(menu);
            String choice = input.next();//get the user choice
            switch(choice){
                case "1":
                    System.out.print("Enter shape type to add: \nC for Circle \nT for Triangle \nS for Square \nR for Rectangle");
                    char type = input.next().toUpperCase().charAt(0);
                    if(type == 'C'){
                        //add your code here
                        System.out.println("A new Circle created.");
                    }
                    else if(type == 'T'){
                        //add your code here
                        System.out.println("A new Triangle created.");
                    }
                    else if(type == 'S'){
                        //add your code here
                        System.out.println("A new Square created.");
                    }
                    else if(type == 'R'){
                        //add your code here
                        System.out.println("A new Rectangle created.");
                    }
                    else{
                        System.out.println("Invalid input, Try again.");
                    }
                case "2":
                    System.out.print("Enter shape ID to remove: ");
                    int id = input.nextInt();
                    // add you code here
                    System.out.println("\nA shape has been Successfully removed.");
                case "3":
                    System.out.println("\n-----List of all Shapes----\n ");
                    // add you code here

                case "4":
                    System.out.println("Please enter translate value:");
                    int trans  = input.nextInt();
                case "5":
                    System.out.println("Please enter scaling value:");
                    int scale = input.nextInt();
                case "6":
                    System.out.println("---- Shapes ----- ");

                case: "0":
                    System.out.println("Exiting .....");
                    break;
                default:
                    System.out.println("Invalid choice, Please enter number only.");
            }

            }
        }
    }
