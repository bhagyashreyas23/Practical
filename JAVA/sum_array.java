package com.company;
import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        int sum =0;
        for(int i=0; i<a.length;i++){
            System.out.print("Enter array element: ");
            a[i]= sc.nextInt();
            if(!(a[i]>=30 && a[i]<=100)){
                sum = sum +a[i];
            }

        }
        System.out.println(sum);

    }
}
