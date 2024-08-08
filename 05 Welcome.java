import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String NAME = input.next();
        System.out.println("Welcome "+ NAME+" to my java coding");

    }
}
