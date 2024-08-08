import java.util.Scanner;

class IdentifyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check its positive ,negative or zero");
        System.out.print("enter a number to check: ");
        double a = input.nextDouble();

        if (a>0){
            System.out.println("this number is positive");
        }
        else if (a<0) {
            System.out.println("this number is negative");
        }
        else
        {
            System.out.println("this number is zero");
        }
    }
}
