import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("this is arithmetic operator challenge");
        System.out.print("enter your first number: ");
        int a = input.nextInt();

        System.out.print("enter your second number: ");
        int b = input.nextInt();

        System.out.println("addition of two number "+(a+b));
        System.out.println("substraction of two number "+(a-b));
        System.out.println("multiplication of two number "+(a*b));
        System.out.println("division of two number "+(a/b));
        System.out.println("modulos of two number "+(a%b));
    }
}
