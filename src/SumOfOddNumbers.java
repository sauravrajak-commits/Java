import java.util.Scanner;

class SumOfOddNumbers{
    public static void main(String[] args) {
        System.out.println("Welcome to OddSum Calculator !! ");
        int number = readInput();
        System.out.println("OddSum till "+ number + " is : " + sumoffodd(number) );
    }

    public static int readInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Number: ");
        return input.nextInt();
    }

    public  static int sumoffodd(int number){
        int sum = 0;
        int i = 1;
        while (i <= number){

            sum += i;
            i += 2;
        }
        return  sum;
    }

}
