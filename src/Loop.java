public class Loop {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 1000){
            System.out.println(num);
            num++;
        }
    }
}


class Greet{
    public static void main(String[] args) {

       greet("Saurav");

    }

    public static void greet (String name){
        System.out.println("Hello " + name);
    }
}

