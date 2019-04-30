package com.ibm;

public class MethodPractice
{
    int a,b;
       MethodPractice(){
           System.out.println("constructor 1 got invoked");
       }
       MethodPractice(int a ,int b){
           this.a=a;
           this.b=b;
        int c=   this.a+this.b;
           System.out.println("i am in parameterised constructor with result"+ " "+c);
       }
       //copy constructor
    MethodPractice(MethodPractice mp3){
        System.out.println("copy constructor got invoked");
    }
//            static int a=10;
      public void display(){
        System.out.println("Hello!! i am in method");

        }
    public static void main(String[]args){
      MethodPractice mp1=new MethodPractice();

      //MethodPractice mp2=new MethodPractice(23,13);
      //implementing constructors

//        System.out.println("this is the value of a variable"+" "+MethodPractice.a);
//int l=MethodPractice.display();
//        System.out.println("static Method got  invoked"+ " "+l);

       //implementing copy constructor
        MethodPractice mp2=new MethodPractice(mp1);
        System.out.println("invoking method via mp1 object");
        mp1.display();
        System.out.println("invoking object via mp2 object");
        mp2.display();
       }
}
