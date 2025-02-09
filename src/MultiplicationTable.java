import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = read();
        table(number);
    }

    public static int read(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which Table You Want to print ? ");
        return  input.nextInt();
    }


    public static  void table(int number){
        int i = 1;
        while (i <=10){
            System.out.println(number*i);
            i++;
        }
    }
}
