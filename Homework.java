import java.util.Scanner;

public class Homework {
     public static void main(String args []){
        System.out.println("Enter 3 numbers:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
       
        if (a <= b  && b <= c){
            System.out.println("min = "+ a);
            System.out.println("max = "+ c);
        }
        else if (a <= c && c <= b ){
            System.out.println("min = "+ a);
            System.out.println("max = "+ b); 
        }
        else if (b <= a &&   a <= c ){
            System.out.println("min = "+ b);
            System.out.println("max = "+ c); 
        }
        else if ( b <= c && c <= a ){
            System.out.println("min = "+ b);
            System.out.println("max = "+ a); 
        }
        else if (c <= a && a <= b ){
           System.out.println("min = "+ c);
           System.out.println("max = "+ b); 
        }
        else if (c <= b && c <= a){
           System.out.println("min = "+ c);
           System.out.println("max = "+ a); 
        }
        else{
            System.out.println("Invalid values");
        }
        double result = (a + b + c) / 3.0 ;
        System.out.println("average= "+ result);
     }
     
}
// import java.util.Scanner;

// public class HB1 {
//     public static void main(String args[]) {
//         System.out.println("Enter 3 numbers:");
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();
//         scan.close();

//         int min, max;

//         if (a <= b && a <= c) {
//             min = a;
//             if (b >= c) {
//                 max = b;
//             } else {
//                 max = c;
//             }
//         } else if (b <= a && b <= c) {
//             min = b;
//             if (a >= c) {
//                 max = a;
//             } else {
//                 max = c;
//             }
//         } else {
//             min = c;
//             if (a >= b) {
//                 max = a;
//             } else {
//                 max = b;
//             }
//         }

//         System.out.println("min= " + min);
//         System.out.println("max= " + max);

//         double average = (a + b + c) / 3.0;
//         System.out.println("average= " + average);
//     }
// }
// import java.util.Scanner;

// public class HB1 {
//     public static void main(String args[]) {
//         System.out.println("Enter 3 numbers:");
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int c = scan.nextInt();
//         scan.close();

//         int min = a;
//         int max = a;

//         if (b < min) {
//             min = b;
//         }
//         if (c < min) {
//             min = c;
//         }

//         if (b > max) {
//             max = b;
//         }
//         if (c > max) {
//             max = c;
//         }

//         System.out.println("min= " + min);
//         System.out.println("max= " + max);

//         double average = (a + b + c) / 3.0;
//         System.out.println("average= " + average);
//     }
// }
