package fariha;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Single dimensional
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size: ");

        int size = input.nextInt();
        int a[] = new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("Please enter the value for :"+i);
            a[i]=input.nextInt();
        }

        /** a[0] = 12;
        a[1] = 26;
        a[2] = 4;
        a[3] = 18;
        a[4] = 20;
        for (int i=0;i< a.length;i++)
        {
            System.out.println(a[i]);
        }
         */
        for (int i:a)
        {
            System.out.println(i);
        }
    }
}
