import java.util.Scanner;

public class SomeOfTheDigits {
    public static void main(String[] args) {
        int number = readInput();
        int output = sumOfDigits(number);
        System.out.println("The Sum of the digits is : "+ output);



    }
    public static int readInput(){
        System.out.println("Welcome to Digit Calculator ");
        Scanner input  = new Scanner(System.in);
        System.out.println("Please Enter The Number : ");
        return input.nextInt();
    }


    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return  sum;
    }


}


