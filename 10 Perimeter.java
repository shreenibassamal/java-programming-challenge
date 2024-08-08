import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculation for perimeter of rectangle ");
        System.out.print("enter left side length as A:");
        double A = input.nextDouble();

        System.out.print("enter botom side length as B: ");
        double B = input.nextDouble();

        System.out.print("enter right side length as C: ");
        double C = input.nextDouble();

        System.out.print("enter top side length as D: ");
        double D = input.nextDouble();

        double perimeterOfRectangle = A+B+C+D;

        System.out.println("perimeter of rectangle is: "+perimeterOfRectangle);
    }
}
