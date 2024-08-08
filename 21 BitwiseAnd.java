import java.util.Scanner;

class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("showcasing bitwise AND operator");
        System.out.print("enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("enter second number: ");
        int secondNumber = input.nextInt();

        int result = (firstNumber & secondNumber);

        System.out.println("result is: "+ result);
    }
}
