import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();
        if (age % 2 == 0) {
            System.out.println("Your Age is Even");
        } else {
            System.out.println("Your Age is Odd");
        }
    }
}
