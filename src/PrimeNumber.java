import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime Number Checker ");
        System.out.println("Please Enter the Number: ");
        int number = input.nextInt();
        String result = isPrime(number);
        System.out.println(result);
    }

    public static String isPrime(int number) {

        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return "It is Not a Prime Number";
            }
            i++;
        }
        return " It is a prime Number ";


    }
}
