package com.company;
import java.util.Scanner;
public class array_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        while(!(a>=90 && a<=100)){
            System.out.println("Enter a number: ");
             a = sc.nextInt();


        }
        System.out.println("Error!Please do not enter number between 90 to 100");

    }
}
