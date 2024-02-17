import java.util.Scanner;
public class calculus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    enterValue(sc);
    int a = sc.nextInt();
    valueEnter(sc);
    int b = sc.nextInt();
  
    Scanner in = new Scanner(System.in);
    
    selectOperation(in);
    
    String x = in.nextLine();
      
    conditionSimvol(x, a, b);
    
    
    }


  public static void enterValue(Scanner sc){
    System.out.println("Enter a value:");
      
  }
  public static void valueEnter(Scanner sc){
     System.out.println("Enter a value:");
  }
  public static void selectOperation(Scanner in){
    System.out.println("Select an operation:");
    System.out.println(" +");
    System.out.println(" -");
    System.out.println(" *");
    System.out.println(" /");
  }
    
  public static void conditionSimvol(String x, int a, int b){
    
      if (x.equals("+")) {
        System.out.println(a + b);
    } else if (x.equals("-")) {
      System.out.println(a - b);
    } else if (x.equals("*")) {
      System.out.println(a * b);
    } else if (x.equals("/")) {

      System.out.println(a / b);
  }
  
  }
  
}