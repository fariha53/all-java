package fariha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        char a[]= new char[size];
        for (int i=0;i<size;i++)
        {
            a[i] =input.next().charAt(0);
        }
        for (char i :a)
        {
            System.out.println(i);
        }
    }
}
