import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculator to check leap year\n");

        System.out.println("enter any your to check: ");
        int year = input.nextInt();

        if (year % 4 ==0 && year%400 ==0 || year % 100 != 0 ){
            System.out.println("this is leap year");
        }
        else
        {
            System.out.println("this is not a leap year");
        }
    }
}
