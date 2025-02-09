import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();
        if(age <= 18){
            System.out.print("You are eligible for Driving Licence");
        }else {
            System.out.println("You are not eligible for Driving Licence");
        }
    }
}
