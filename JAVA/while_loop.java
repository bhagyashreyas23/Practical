package com.company;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int a = sc.nextInt();
//        int i=2;
//        int count = 0;
//        while (i<=a/2) {
//            if (a % i == 0) {
//                count = count + 1;
//                break;
//            }
//            i++;
//        }
//        if(count == 0){
//
//            System.out.println("It is a prime number.");
//            }
//        else{
//            System.out.println("It is not a prime number.");
//            }

//        int i =5;
//        while(i>=1){
//            int j =1;
//            while (j<=i){
//                System.out.print("*");
//                j++;
//
//            }
//            System.out.println();
//            i--;
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int m =0;
        while(n>0){
            m = n % 10;
            sum = sum + m;
            n = n /10;
        }
        System.out.println(sum);


    }
}
