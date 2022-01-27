package begineerjava;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input =new Scanner(System.in);
        int num1,num2,res;
        System.out.println("Enter the first number: ");
        num1=input.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2=input.nextInt();

       res = num1+num2;
       System.out.println("Sum = "+res);
       res = num1-num2;
       System.out.println("Sub = "+res);
       System.out.println("Division = "+num1/num2);
       System.out.println("Multiplication = "+num1*num2);
       System.out.println("Remainder = "+num1%num2);


    }
}
