import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("product of two floating points numbers");
        System.out.print("enter first float number: ");
        float a = input.nextFloat();
        System.out.print("enter second float number: ");
        float b = input.nextFloat();

        float c = a+b ;

        System.out.println("product of two float number is: "+ c);
    }

}
