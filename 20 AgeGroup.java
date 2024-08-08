import java.util.Scanner;

class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculator to check in which group your age is mathch");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age <= 13){
            System.out.println("you are in child group");
        }
        else if (age <= 20 ) {
            System.out.println("you are in teen group");
        }
        else if (age <= 60) {
            System.out.println("you are in adult group");
        } else {
            System.out.println("you are in senior group");
        }
    }
}
