package com.ibm;

import java.util.Scanner;

public class TwoDarray
{
    public static void main(String[]args){
        //implementing 2D array at compile time

        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        //implementing 2D array at run time
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        int arr3[][]=new int[3][3];

        System.out.println("enter the elements of the first array");
        Scanner scn=new Scanner(System.in);


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                arr1[i][j]=scn.nextInt();

            }
        }
        System.out.println("first matrix is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("enter the elements of the second matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                arr2[i][j]=scn.nextInt();
            }
        }
        System.out.println("the second matrix is");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println(" ");
        }

//        System.out.println("after addition, the resultant matrix is");
        System.out.println("after subtraction, the resultant matrix is");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
       // arr3[i][j]= arr1[i][j] + arr2[i][j]; for addition
                arr3[i][j]= arr1[i][j] - arr2[i][j];//for subtraction
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
