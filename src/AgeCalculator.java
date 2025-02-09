import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to Age Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Date of Birth: ");
        int dob = input.nextInt();
        System.out.println("Please Enter Your Current Date: ");
        int currentDate = input.nextInt();

        int calculatedAge = currentDate - dob;
        System.out.println("Your Age is: " + calculatedAge);
    }
}

class BitwiseOperator{


    public static void main(String[] args) {
        
        System.out.println( 1 << 3);
        System.out.println( 1 & 3);
        System.out.println( 1 ^ 3);
        System.out.println( 1 | 3);
    }
}
