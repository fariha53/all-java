package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input =new Scanner(System.in);
        double b,h,res,r;
        System.out.println("Enter base: ");
        b = input.nextDouble();
        System.out.println("Enter height: ");
        h = input.nextDouble();
        res = 0.5*b*h;
        System.out.println("Area of triangle ="+res);
        System.out.println("\nEnter radius: ");
        r = input.nextDouble();
        res =3.1416* r *r;
        System.out.println("Circle ="+res);

    }
}
