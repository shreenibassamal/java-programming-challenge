import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("this programm is cheak which number is greatest between three number");

        System.out.print("enter first number: ");
        double a = input.nextDouble();

        System.out.print("enter second number: ");
        double b = input.nextDouble();

        System.out.print("enter third number: ");
        double c = input.nextDouble();

        if (a > b && a > c){
            System.out.println("first number is greatest number");
        } else if (b>a && b> c) {
            System.out.println("second number is greatest number");
        }
        else {
            System.out.println("third number is greatest number");
        }

    }
}
