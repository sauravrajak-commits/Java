class MethodsInJava{
  public static void main (String []args){
    System.out.println("Hello World!!");
//    greetUser();
    printFirstPattern();
  }

  public static void greetUser(){
    System.out.println("Good Morining Saurav");
  }

  public static  void printFirstPattern(){
    int rows = 0;
    while (rows < 20){
      System.out.print("*");
      int i = 0;
      while (i < rows){
        System.out.print(" *");
        i++;
      }
      System.out.println();
      rows++;

    }
  }
}