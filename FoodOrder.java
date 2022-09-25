import java.util.Scanner;


public class FoodOrder {

    //Declaring and initializing different variables, including prices of our food and drinks in our menu'

    int ch;
    int quantity;
    int total;
    String again;

    int burger = 55;
    int frenchFries = 30;
    int pizza = 69;
    int sandwich = 55;
    int kebab = 30;
    int durum = 40;

    int water = 10;
    int soda = 20;
    int milkshake = 49;

    //Our menu is now done

    Scanner sc = new Scanner(System.in);
    /* Scanner class is a class of .util package so we must import this package in our java program.
This is done by writing the following - import java.util.Scanner; (made in the beginning of the program, before class)
Scanner sc=new Scanner(System.in);
Here, we use Scanner class object for using nextInt() (which we will use later)
and since nextInt() is a method of Scanner class, we need to let our program know that we're going to use a method
within this class.*/

    //Now we'll create a method for displaying our menu
    public void displayMenu() {
        System.out.println("          Welcome to Los Callientes!");
        System.out.println("           ________________________");
        System.out.println("            1. Burger          55,-");
        System.out.println("            2. FrenchFries     30,-");
        System.out.println("            3. Pizza           69,-");
        System.out.println("            4. Sandwich        55,-");
        System.out.println("            5. Kebab           30,-");
        System.out.println("            6. Durum           40,-");
        System.out.println("            7. Water           10,-");
        System.out.println("            8. Soda            20,-");
        System.out.println("            9. Milkshake       49,-");
        System.out.println("_____________________________________");
        System.out.println("         What do you want to order today?");
    }
    //This will be the menu our program will have access to

             /*Now we want to be able to make an order of a specific item of the menu.
             /For this, we will use the switch case. Switch cases are nice to use, to avoid repetitive coding.
             It tests out 1 variable, and depending on that variable it gives us multiple choices.*/

    //Before we continue, we're going to create a method called generateBill (this will be used later)
    public void generateBill() {
        System.out.println("Thank you for ordering!");
        System.out.println("Your Bill is : " + total + "");
    }

    public void order() {

        while (true) {
            System.out.print("Enter your choice ");

            ch = sc.nextInt(); //nextInt() reads in a string of digits (characters) and converts them into an int type.
            switch (ch) {
                case 1: //Burger
                    System.out.println("You have selected Burger");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * burger;
                    break;
                case 2: //frenchFries
                    System.out.println("You have selected FrenchFries");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * frenchFries;
                    break;

                case 3: //Pizza
                    System.out.println("You have selected Pizza");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;
                    break;

                case 4: //Sandwich
                    System.out.println("You have selected Sandwich");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * sandwich;
                    break;

                case 5: //Kebab
                    System.out.println("You have selected Kebab");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * kebab;
                    break;

                case 6: //Durum
                    System.out.println("You have selected Durum");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * durum;
                    break;

                case 7: //Water
                    System.out.println("You have selected Water");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * water;
                    break;

                case 8: //Soda
                    System.out.println("You have selected Soda");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * soda;
                    break;

                case 9: //Milkshake
                    System.out.println("You have selected Milkshake");
                    System.out.println();
                    System.out.println("Enter the desired quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * milkshake;
                    break;

                default:
                    break;
            }

            System.out.println();
            System.out.println("Do you wish to order anything else? (Y/N) : ");
            again = sc.next();

            if (again.equalsIgnoreCase("Y")) {
                order();
            }
                 else if (again.equalsIgnoreCase("N")) {
                    generateBill();
                    System.exit(1);
                } else {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }













