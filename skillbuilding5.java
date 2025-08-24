import java.util.Scanner; // scanner library
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //       scanner object
   int category;
    System.out.print("Enter first side: ");
    int number1 = sc.nextInt();
    System.out.print("Enter second side: ");
    int number2 = sc.nextInt();
    System.out.print("Enter third side: ");
    int number3 = sc.nextInt();

    if (number1 + number2 > number3 && number1 + number3 > number2 && number2 + number3 > number1)
      System.out.print("The triangle is valid");
    else
      System.out.print("The triangle is not valid");
  }
}

    
