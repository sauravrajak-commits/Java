import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Please Enter Third Number: ");
        int num3 = input.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.print("Number First is Greatest : "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.print("Number Second is Greatest : "+num2);
        }else{
            System.out.print("Number Third is Greatest : "+num3);
        }
    }
}
