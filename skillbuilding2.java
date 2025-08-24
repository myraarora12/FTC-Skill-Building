import java.util.Scanner; // scanner library
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // scanner object
    System.out.print("Enter first number: ");
    int number1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int number2 = sc.nextInt();
    System.out.print ("Enter the operator ( + - * / )");
    char operator = sc.next().charAt(0);

    switch(operator){
      case '+':
          System.out.println("The result is: " + (number1 + number2));
          break;
      case '-':
          System.out.println("The result is: " + (number1 - number2));
          break;
      case '*':
          System.out.println("The result is: " + (number1 * number2));
          break;
      case '/':  
          System.out.println("The result is: " + (number1 / number2));
          break;
      

    }
}
}
