package com.ibm;

public class SmallestLargest
{
    public static void main(String[]args){

        //finding smallest and largest element in array

        int arr[]={12,34,56,78,45,90};

        int small=arr[0];
        int big=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
            else
            {
                big=arr[i];
            }

        }

        System.out.println("the largest element is "+" "+big);
        System.out.println("the smallest element is"+" "+small);
    }
}
