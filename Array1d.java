package com.ibm;

import java.util.Scanner;

public class Array1d
{
    public static void main(String[]args){
     //initialising array

        int a[]={23,45,78,67,45};

        for(int i=0;i<a.length;i++){
            System.out.println("array elements are"+ " " + a[i]);
        }

//at run time
        int arr[]=new int[100];

        System.out.println("how many elements ? ");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        System.out.println("enter the elements");
        for(int j=0;j<num;j++){

            arr[j]=scn.nextInt();

        }
        System.out.println("let's see what elements you have entered");

        for(int k=0;k<num;k++){
            System.out.println("element"+ " " + k + "is" + arr[k]);
        }



    }
    }



