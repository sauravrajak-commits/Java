import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year or Not Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Year: ");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Your Year is Leap Year "+year);
                } else {
                    System.out.println("Your Year is not Leap Year " + year);
                }
            }
        }else {
            System.out.println("Your Year is Leap Year");
        }
    }
}
