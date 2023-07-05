import java.util.Scanner;

public class Task2 {
    public static void main(String args[]){
		System.out.println("Enter username ");
		Scanner scum = new Scanner(System.in);
        String username = "Admin";
        String password = "P@ssword";
        
        String name = scum.nextLine();
       if (name.equals(username))
        {
          System.out.println("Enter password:");
        }
        else
         {
          System.out.println("No user with this name");
           scum.close();
          return; 
         }

        String pass = scum.nextLine();
       if (pass.equals(password))
        {
            System.out.println("Hi, " +username+ ". Welcom to the club body" );
        }
        else
        {
            System.out.println("You have entered a wrong password");
        }
        scum.close();
    }
}
