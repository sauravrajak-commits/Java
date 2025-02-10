import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD Calculator !! ");
        System.out.println("Please Enter Your Number ");
        int first = input.nextInt();
        System.out.println("Please Enter Your Number ");
        int second = input.nextInt();
        int GCD = gcd(first,second);
        System.out.println("GCD of the two number is : "+GCD);
    }

    public static int gcd(int first,int second){

        int gcd = 1;
        int i = 2;
        int least = least(first,second);
        while(i<=least){

            if( first % i == 0 && second % i ==0){
                gcd = i;

            }
            i++;
        }

        return  gcd;
    }

    public static int least(int first, int second){
        if(first > second){
            return  first;
        }else {
            return second;
        }
    }
}
