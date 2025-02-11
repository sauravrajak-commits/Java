import java.util.Scanner;

public class ReverseTheDigits {

    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Digit Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Number : ");
        int number = input.nextInt();
        int reverse = reverse(number);
        System.out.println("Reverse of Your Number is : "+reverse);

    }

    public static  int reverse(int number){

        // store new number
        int newNumber = 0;
        while(number > 0){
            int digit = number % 10;
            // store the modulo
            newNumber = (newNumber*10)+digit;
            // divide in every loop
            number /= 10;
        }
        return newNumber;
    }
}
