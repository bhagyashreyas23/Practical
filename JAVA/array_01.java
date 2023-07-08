package com.company;

import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] =new int[3][3];



        for(int i =0; i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = sc.nextInt();

            }

        }
        System.out.println("The elements that are entered: ");
//        for(int i =0; i<4;i++){
//            for(int j=0;j<4;j++){
//                if((i==0)||(j==0)||(j==3)||(i==3)) {
//                    System.out.print(a[i][j] + " ");
//                }
//
//
//            }
//            System.out.println();

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i==j)||(i+j==2)) {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
