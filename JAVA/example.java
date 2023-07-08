package com.company;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height: ");
        int height = sc.nextInt();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(height>=120){
            System.out.println("You can ride");
            if(age>=18){

                System.out.println("You have to pay $12");
            }
            else{
                System.out.println("You have to pay $7");
            }
        }
        else{
            System.out.println("You cannot ride");
        }


    }
}
