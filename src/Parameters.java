import java.util.Scanner;

public class Parameters {

    public static void main(String[] args) {

        int num1  = read();
        int num2 = read();
        int output = sum(num1,num2);
        System.out.println("The sum of numbers is :   "+output);
    }

    public static int read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The  Number:  ");

        return  input.nextInt();
    }

    public static int sum(int first, int second){
        return  first+second;
    }
}
