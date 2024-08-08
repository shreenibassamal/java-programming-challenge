import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lets swap two number");
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();



        int c = b;
        b = a ;
        a = c ;

        System.out.println("after swap two number");
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }
}
