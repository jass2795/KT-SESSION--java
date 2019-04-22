package com.ibm;

import java.io.IOException;

public class ConditionalStatement
{
    public static void main(String[]args) throws IOException {
        int a=1000,b=890;
        int c=3;
//        System.out.println("v");
//        System.out.println("i");
//        System.out.println("b");
//        System.out.println("g");
//        System.out.println("y");
//        System.out.println("o");
//        System.out.println("r");

        //if statement
        String name="jasleen";

        if(name.equalsIgnoreCase("jasleen")){
            System.out.println("yes names match");

        }

        //if else
        if(name.equalsIgnoreCase("jasleenkaur")){
            System.out.println("yes names match");

        }
        else
        {
            System.out.println("names don't match");
        }


        //ladder if
            if(a>b)

            System.out.println("first number is greater" + " " + a);

            else if(a==b)
            System.out.println("both are equal");
        else
            System.out.println("second number is greater"+" "+b);

          //conditional statement

        String result=a>b?"greater number is "+" "+a :"greater number is "+" "+b;


        System.out.println("conditional statement"+" "+result);
        //implementing switch case
//        System.out.println("enter your choice");
//        char ch=(char)System.in.read();
//    switch(ch){
//        case 'v':
//            System.out.println("violet color");
//            break;
//
//        case 'i':
//            System.out.println("indigo color");
//            break;
//        case 'b':
//            System.out.println("blue color");
//            break;
//        case 'g':
//            System.out.println("green color");
//            break;
//        case 'y':
//            System.out.println("yellow color");
//            break;
//        case 'o':
//            System.out.println("orange color");
//            break;
//        case 'r':
//            System.out.println("red color");
//            break;
//        default:
//            System.out.println("enter any of the above mentioned alphabets");
//

        //implementing iterative control structure
//for loop

        long startTime = System.currentTimeMillis();
        for(int i=0;i<10;i++){

            System.out.println("i am inside loop"+ i + " ");

    }
        long stopTime = System.currentTimeMillis();
  long elapsedTime = stopTime - startTime;
        System.out.println("time taken by for loop"+" "+elapsedTime);

//while loop
        long startTime1 = System.currentTimeMillis();
        int j=0;
        while(j<10){
            System.out.println("Hello ! i am inside while loop"+ " "+j);
            j++;
        }
        long elapsedTime1 = stopTime - startTime;
        long stopTime1 = System.currentTimeMillis();
        System.out.println("time taken by while loop"+" "+elapsedTime1);
       // do while loop
        long startTime2 = System.currentTimeMillis();
        int k=0;
        do{

            System.out.println("It will be definitely executed once"+" "+k);
            k++;
        }
  while(k<10);
        long elapsedTime2 = stopTime - startTime;
        long stopTime2 = System.currentTimeMillis();

        System.out.println("time taken by do while loop"+" "+elapsedTime1);
    }
}


//    long startTime = System.currentTimeMillis();
//    long stopTime = System.currentTimeMillis();
//    long elapsedTime = stopTime - startTime;