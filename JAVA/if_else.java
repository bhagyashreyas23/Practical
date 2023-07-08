package com.company;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter length: ");
//        int length = sc.nextInt();
//        System.out.print("Enter breadth: ");
//        int breadth = sc.nextInt();
//        if(length==breadth){
//            System.out.println("It is a square.");
//        }
//        else{
//            System.out.println("It is not a square.");
//        }

//        System.out.println("Enter a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter b: ");
//        int b = sc.nextInt();
//        if(a>b){
//            System.out.printf("%d is greater than %d",a,b);
//        }
//        else{
//            System.out.printf("%d is greater than %d.",b,a);
//        }
//        System.out.println("Enter character: ");
//        char a = sc.next().charAt(0);
////        if(Character.isUpperCase(a)){
////            System.out.printf("%c is in Uppercase.",a);
////
////        }
////        else{
////            System.out.printf("%c is in lowercase",a);
////        }
//
//        System.out.println(Character.toUpperCase(a));
//        System.out.println("Enter marks of subject 1: ");
//        int a = sc.nextInt();
//        System.out.println("Enter marks of subject 2: ");
//        int b = sc.nextInt();
//        System.out.println("Enter marks of subject 3: ");
//        int c = sc.nextInt();
//        float avg = (a+b+c)/3.0f;
//        System.out.println("Your overall percentage is: "+avg);
//        if(avg>40 && a>=33 && b>=33 && c>=33){
//            System.out.println("Congrats! You have been promoted.");
//        }
//        else {
//            System.out.println("Oops! You have not been promoted.");
//        }

//        float tax = 0;
//        System.out.println("Enter your income: ");
//        float income = sc.nextFloat();
//        if(income<250000){
//            tax = tax + 0;
//        } else if (income>250000 && income <500000) {
//            tax = tax + (income-250000)*5/100;
//
//
//        } else if (income>500000 && income<1000000) {
//            tax = tax + (500000 - 250000)*5/100;
//            tax = tax + (income - 500000)*20/100;
//
//        } else if (income>1000000) {
//            tax = tax + (500000 - 250000)*5/100;
//            tax = tax + (1000000 - 500000)*20/100;
//            tax = tax + (income - 1000000)*30/100;
//
//
//        }
//        System.out.println("You have to pay: "+tax);

//        System.out.println("Enter the number: ");
//        int a = sc.nextInt();
//        switch(a){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }
        System.out.println("Enter character: ");
        char c = sc.next().charAt(0);
        if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
            System.out.println(c+ " is a vowel.");
        }
        else{
            System.out.println(c+ " is a consonant");
        }
    }
}
