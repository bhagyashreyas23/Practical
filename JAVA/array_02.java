package com.company;
import java.util.Scanner;

public class array_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int a[]={1,2,3,4,5,6};
//        for(int i=a.length-1;i>=0;i--){
//            System.out.print(a[i]+" ");
//        }
        String a[]={"bhagya","urvi","anamika","ishika"};
        int count = 0;
        for(int i=0;i<a.length;i++){
            char first_char = a[i].toUpperCase().charAt(0);
            if(first_char == 'A' || first_char == 'E' || first_char == 'I' || first_char == 'O' || first_char == 'U'){
                count++;
            }


        }
        System.out.println(count);

    }
}
