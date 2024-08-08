import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("this program is to check the input number is even or odd");
        System.out.print("enter any number: ");
        int a = input.nextInt();

        if (a % 2==0){
            System.out.println("this number is even");
        }
        else {
            System.out.println("this number is odd");
        }
    }
}
