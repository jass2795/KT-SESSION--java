package com.ibm;

public class Operators
{
    public static void main(String[] args) {

        //different operators

        boolean c=true;

        int var=10;
        System.out.println("this is an example of unary operator"+" "+ !c);
        System.out.println("increment operator is used"+" "+ var++);
        System.out.println("increment operator is used"+" "+ ++var);
        //arithmetic operators

        int a=10;
        int b=5;
        System.out.println("Addition "+" "+(a+b));//15
        System.out.println("Subtraction "+" "+ (a-b));//5
        System.out.println("Multiplication  "+" "+a*b);//50
        System.out.println("Division "+" "+a/b);//2
        System.out.println("Remainder "+" "+a%b);//0


        //ternary operator

        int a1=2;
        int b1=5;
        int min=(a1<b1)?a1:b1;
        System.out.println("Result of conditional operator is "+" "+min);


        //assignment operators

        int a2=10;
        int b2=20;
        a2+=4;//a2=a+4 (a2=10+4)
        b2-=4;//b2=b-4 (b2=20-4)
        System.out.println("value of a is"+a);
        System.out.println("value of b is"+b);

    }
}
