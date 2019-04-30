package com.ibm;

class Animal{
    void eat(){
        System.out.println("animals eat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog barks");
    }
}



public class SingleInheritance
{
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.eat();
        dog.bark();
    }
}
