
<<<<<<< HEAD

import java.util.Scanner;
public class Task{
    public static void main(String[] args){
        int num1,num2;

do{

Scanner sc = new Scanner(System.in);
System.out.println("ENTER NUM1");
num1 =  sc.nextInt();


System.out.println("ENTER NUM2");
num2=  sc.nextInt();
if(num1>num2){
System.out.println("Enter an valid numbers");
}
    

}while(num1>num2);






//evenodd starts
int i;
for(i=num1;i<=num2;i++){
    if(i%2==0){
        System.out.println(i + " is even number");
         }
         if(i%2==1){
            System.out.println(i+ " is odd number");
         }
}

=======
<<<<<<< HEAD

=======
>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
import java.util.Scanner;
public class Task{
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("ENTER NUM1");
int num1 =  sc.nextInt();


System.out.println("ENTER NUM2");
int num2=  sc.nextInt();


//evenodd starts
<<<<<<< HEAD
for(int i=num1;i<=num2;i++){
=======
int i;
for(i=num1;i<=num2;i++){
>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
    if(i%2==0){
        System.out.println(i + " is even number");
         }
         if(i%2==1){
            System.out.println(i+ " is odd number");
         }
}

>>>>>>> 6f09fc618c8b15061497d799652d936f36b6e2f3
//evenodd ends



// // prime starts
// 
        for (int x = num1; x <= num2; x++) {
            if (x <= 1) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(x + " is a prime number");
            }
        }




// //multiplaction starts
 


    //    3x1=3
        // num1 "x" i(1..10) "=" num1*i
<<<<<<< HEAD
        for(int j = 1;j<=num2;j++){   
            System.out.println(num1 +"x"+(j) +"="+(num1*(j)));
=======
<<<<<<< HEAD
        for(int k= 1;k<=num2;k++){   
            System.out.println(num1 +"x"+(k) +"="+(num1*(k)));
=======
        for(int i = 1;i<=num2;i++){   
            System.out.println(num1 +"x"+(i) +"="+(num1*(i)));
>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
>>>>>>> 6f09fc618c8b15061497d799652d936f36b6e2f3
        }

    }
    

      }


    


<<<<<<< HEAD

//     import java.util.Scanner;

// public class Task {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("ENTER NUM1");
//         int num1 = sc.nextInt();
        
//         System.out.println("ENTER NUM2");
//         int num2 = sc.nextInt();
        
//         // Even/Odd determination
//         System.out.println("Even/Odd numbers:");
//         for (int i = num1; i <= num2; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i + " is even number");
//             } else {
//                 System.out.println(i + " is odd number");
//             }
//         }
        
//         // Prime number determination and printing within range
//         System.out.println("\nPrime numbers between " + num1 + " and " + num2 + ":");
//         for (int x = num1; x <= num2; x++) {
//             if (x <= 1) {
//                 continue;
//             }
//             boolean isPrime = true;
//             for (int j = 2; j <= Math.sqrt(x); j++) {
//                 if (x % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.println(x + " is a prime number");
//             }
//         }
        
//         // Multiplication table for num1
//         System.out.println("\nMultiplication table of " + num1 + ":");
//         for (int y = 1; y <= 10; y++) {  // Multiplication table up to 10
//             System.out.println(num1 + " x " + y + " = " + (num1 * y));
//         }
        
//         sc.close();
//     }
// }
=======
<<<<<<< HEAD
=======




>>>>>>> 98b4a45dabfbb84b82f746f69dbcc92be70e13a9
>>>>>>> 6f09fc618c8b15061497d799652d936f36b6e2f3
