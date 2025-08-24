import java.util.Scanner; // scanner library
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //       scanner object
   int category;
    System.out.print("Enter the month: ");
    int month = sc.nextInt();

    switch (month) {
      case 3: 
        System.out.println("Spring");
        break;
      case 4: 
        System.out.println("Spring");
        break;
      case 5: 
        System.out.println("Spring");
        break;

        case 6: 
          System.out.println("Summer");
          break;
        case 7: 
          System.out.println("Summer");
          break;
        case 8: 
          System.out.println("Summer");
          break;

        case 9: 
          System.out.println("Autumn");
          break;
        case 10: 
          System.out.println("Autumn");
          break;
        case 11: 
          System.out.println("Autumn");
          break;

        case 12: 
          System.out.println("Winter");
          break;
        case 1: 
          System.out.println("Winter");
          break;
        case 2: 
          System.out.println("Winter");
          break;
    }



    
      
}
  }
