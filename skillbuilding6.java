import static org.junit.Assert.assertFalse;

import java.util.Scanner; // scanner library
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //       scanner object
   int category;
    System.out.print("Enter a number: ");
    int number1 = sc.nextInt();
    

    if (number1 % 4 == 0)
    System.out.println("This is a leap year.");

    else
    System.out.println("This is not a leap year.");}
}

    
