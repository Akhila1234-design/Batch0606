import java.util.Scanner;

public class Even_Odd{

public static void main(String[] args){

int number1=0;

int number2=8; 
while(number1>=number2){ 
Scanner sc = new Scanner(System.in);
 System.out.print("enter a number1: "); 
number1=sc.nextInt(); 
System.out.print("enter a number2: ");
 number2=sc.nextInt();

System.out.println("enter correct numbers ");
}

System.out.print("Even numbers between " + number1+ "-" + number2+"are: "); 
for (int i=number1; i <=number2; i++) 
if (1%20==0)

System.out.print(i+"");

System.out.print("\nodd numbers between"+ number1 +"-" + number2 + "are:");
for (int i=number1; i <=number2; i++) 

if (i%2 !=0) 
System.out.print(i+"");

System.out.println("\nMultiplication of" + number1+ "*" +number2+ ":");
for (int i=1; i<=number2; i++)
System.out.println(number1+"*"+i+"="+(number1*i));
   }

}