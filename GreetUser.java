import java.util.Scanner;
public class GreetUser{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=sc.nextLine();
    System.out.println("Enter your age:");
    int age=sc.nextInt();
    System.out.println("Hello"+name+"!You are"+age+"years old");
  }
}
    
