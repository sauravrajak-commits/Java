import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = readInput();
        long fact = factorial(number);
        System.out.println("Factorial of the given number is : "+fact+ ".");

    }


    public static int readInput(){
        System.out.println("Welcome to Factorial Calculator !!");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Number: ");
        return input.nextInt();
    }

    public static long factorial(int number){

        if(number < 2 ){
            return  1;
        }

        long fact = 1;
        int i = 2;
        while (i <= number){
            fact*=i;
            i++;
        }
            return fact;


    }
}
