package com.ibm;

import java.util.Scanner;

public class Searching
{
    public static void main(String[]args){

        int arr[]={23,12,14,15,67};
        System.out.println("enter the number you want to search");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        for(int i=0;i<arr.length;i++){

            if(arr[i]==num){
                System.out.println("yes, the element is there on index "+" "+i);
                System.exit(0);
            }
        }
        System.out.println("Sorry! element not found!");

    }
}
