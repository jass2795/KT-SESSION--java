package com.ibm;

public class ConstructorOverloading
{
    ConstructorOverloading(){
        System.out.println("i am in a constructor with 0 arguments");
    }
    ConstructorOverloading(int a,int b){
        System.out.println("i am in second constructor receiving two parameters");
        int c=a+b;
        System.out.println("Result is"+" "+c);
    }
    ConstructorOverloading(int a){
        System.out.println("i am in third constructor receiving only one parameter"+" "+a);
    }
    public static void main(String[]args){

        ConstructorOverloading co1=new ConstructorOverloading();
        ConstructorOverloading cp2=new ConstructorOverloading(10,20);
        ConstructorOverloading cp3=new ConstructorOverloading(12);

    }
}
