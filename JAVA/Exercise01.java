package com.company;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[]args){
        System.out.println("Welcome to Calculate your Marks ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject: ");
        int a = sc.nextInt();
        System.out.println("Enter marks of second subject: ");
        int b = sc.nextInt();
        System.out.println("Enter marks of third subject: ");
        int c = sc.nextInt();
        System.out.println("Enter marks of fourth subject: ");
        int d = sc.nextInt();
        System.out.println("Enter marks of fifth subject: ");
        int e = sc.nextInt();
        float percentage = (a+b+c+d+e)/5;
        System.out.println("The percentage of student is: "+percentage);
        System.out.println("Thanks for using our software for calculating your CBSE Board marks");

    }
}
