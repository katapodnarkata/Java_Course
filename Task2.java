import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
		Scanner scum = new Scanner(System.in);

        String username = "Admin";
        String password = "P@ssword";

        System.out.println("Enter username ");
        String name = scum.nextLine();

          if (!name.equals(username))
        {
          System.out.println("No user with this name");
        }
        else
        {
          System.out.println("Enter password:");
          String pass = scum.nextLine();
         while (!pass.equals(password)) {
          System.out.println("Incorrect password");
          System.out.println("Enter password:");  
        pass = scum.nextLine(); 
        scum.close();
        }
        System.out.println("Hi, "+username+"! Welcome to the club buddy");
        }
    }
}
