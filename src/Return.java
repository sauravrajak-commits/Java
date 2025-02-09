import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

    int result = Sum();
        System.out.println("Sum of the Number is : "+result);

    }

    public static int Sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.println("Please Enter the Number: ");
        int first = input.nextInt();
        System.out.println("Please Enter the Number: ");
        int second = input.nextInt();

        return first+second;
    }
}
