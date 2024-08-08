import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to grades calculator\n");
        System.out.print("please enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >=90){
            System.out.println("your grade is A");
        }
        else if (percentage >= 75) {
            System.out.println("your grade is B");
        }
        else if (percentage >= 60) {
            System.out.println("your grade is C");
        }
        else if (percentage >= 30 ) {
            System.out.println("your grade is D");
        }
        else if (percentage <=30) {
            System.out.println("your grade is F ");
        }

    }
}
