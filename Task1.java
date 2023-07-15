import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){
		System.out.println("Enter day of the week number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
 
		switch (number){
		case 1: System.out.println ("Sunday"); break;
		case 2: System.out.println ("Monday"); break;
		case 3: System.out.println ("Tuesday"); break;
		case 4: System.out.println ("Wednesday"); break;
        case 5: System.out.println ("Thursday"); break;
        case 6: System.out.println ("Friday/Sabat"); break;
        case 7: System.out.println ("Saturday/Sabat"); break;
		default: System.out.println("There are only 7 days in a week");
		}
        scan.close();
	}
}
