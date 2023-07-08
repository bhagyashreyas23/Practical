package com.company;
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[]args){
        System.out.println("Welcome to SI Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int p = sc.nextInt();
        System.out.println("Enter rate: ");
        int r = sc.nextInt();
        System.out.println("Enter time in years: ");
        int t=sc.nextInt();
        float si = (p*r*t)/100;
        System.out.println("The simple interest is: "+si);
        System.out.println("Thank you for using our software");

    }
}
