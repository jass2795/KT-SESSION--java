package com.ibm;

class Animal2{
    void eat(){
        System.out.println("animals eat");
    }
}

class Dog2 extends  Animal{
    void bark(){
        System.out.println("dogs bark");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("cats meow!!");
    }
}
public class HierarchichalInheritance
{
    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.meow();
        cat.eat();

    }
}
