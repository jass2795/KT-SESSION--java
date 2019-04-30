package com.ibm;


class A{
    void display(){
        System.out.println("i am in class A");
    }
}


class B{
    void display(){
        System.out.println("i am in class B");
    }
}

class C extends A{
    void display(){
        System.out.println("i am in class C");
    }
}
public class MultipleInheritance
{
    public static void main(String[] args) {

        C obj1=new C();
        obj1.display();


    }
}
