import java.util.Scanner; // scanner library
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //       scanner object
   int category;
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    if (age<0){
      category = 0;
    }
    else if (age <18){
      category = 1;
    }
    else {
      category = 2;
    }


    switch (category){
      case 0:
        System.out.println("Invalid age");
        break;
      case 1:
        System.out.println("You are a minor");
        break;
      case 2:
        System.out.println("You are an adult");
        break;
    }


    
      
}
  }
