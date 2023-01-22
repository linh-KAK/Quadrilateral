import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nWELCOME TO THE QUADRILATERAL CALCULATOR!\n-------------------------------------------" +
                "\n\n         > Select a quadrilateral shape by entering an integer\n" +
                "         > Enter the required values\n         > To quit, enter 0\n");

        while(true) {

            System.out.println("Select a shape:\n\n1. Parallelogram\n2. Rectangle\n3. Square\n4. Rhombus\n5. Trapezoid\n");
            int input = checkIntInput();

            if (input==0) {
                break;
            } else {
                getShape(input);
            }
        }
    }

    public static int checkIntInput() {
        while (true) {
            try {
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
            }
        }
    }

    public static double checkDoubleInput() {
        while (true) {
            try {
                return Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter an numerical value.");
            }
        }
    }
    public static void getShape(int user_choice) {
        double base;
        double height;
        double side;

        switch (user_choice){

            case 1:

                System.out.println("Enter base: ");
                base = checkDoubleInput();
                System.out.println("Enter height: ");
                height = checkDoubleInput();
                System.out.println("Enter diagonal side: ");
                side = checkDoubleInput();

                Parallelogram p = new Parallelogram(base, height ,side);
                System.out.println("The area of the parallelogram is: " + p.getArea() + "\nThe perimeter of the parallelogram is: "
                + p.getPerimeter());
                break;

            case 2:

                System.out.println("Enter base: ");
                base = checkDoubleInput();
                System.out.println("Enter height: ");
                height = checkDoubleInput();

                Rectangle r = new Rectangle(base, height);
                System.out.println("The area of the rectangle is: " + r.getArea() + "\nThe perimeter of the rectangle is: "
                        + r.getPerimeter());
                break;

            case 3:

                System.out.println("Enter side: ");
                side = checkDoubleInput();

                Square s = new Square(side);
                System.out.println("The area of the square is: " + s.getArea() + "\nThe perimeter of the square is: "
                        + s.getPerimeter());
                break;

            case 4:

                System.out.println("Enter base:");
                base = checkDoubleInput();
                System.out.println("Enter height: ");
                height = checkDoubleInput();
                System.out.println("Enter diagonal side: ");
                side = checkDoubleInput();

                Rhombus rh = new Rhombus(base, height, side);
                System.out.println("The area of the rhombus is: " + rh.getArea() + "\nThe perimeter of the rhombus is: "
                        + rh.getPerimeter());
                break;

            case 5:

                double base2;
                double side2;

                System.out.println("Enter base 1: ");
                base = checkDoubleInput();
                System.out.println("Enter base 2: ");
                base2 = checkDoubleInput();
                System.out.println("Enter height: ");
                height = checkDoubleInput();
                System.out.println("Enter side 1: ");
                side = checkDoubleInput();
                System.out.println("Enter side 2: ");
                side2 = checkDoubleInput();

                Trapezoid t = new Trapezoid(base, base2, height, side, side2);
                System.out.println("The area of the trapezoid is: " + t.getArea() + "\nThe perimeter of the trapezoid is: "
                        + t.getPerimeter());
                break;

            default:
                System.out.println("Please select an option.");
        }
    }
}