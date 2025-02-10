import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM Calculator !! ");
        System.out.println("Please Enter Your Number ");
        int first = input.nextInt();
        System.out.println("Please Enter Your Number ");
        int second = input.nextInt();
        int LCM = lcm(first,second);
        System.out.println("LCM of the two number is : "+LCM);

    }

    public static int lcm(int first, int second){
        int i = 1;
        while (true){
            int factor = first*i;
            if( factor % second== 0){
                return  factor;

            };
            i++;
        }



    }
}
