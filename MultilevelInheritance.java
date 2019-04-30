package com.ibm;

class Animal1{
    void eat(){
        System.out.println("animals eat");
    }
}

class Dog1 extends Animal{
    void bark(){
    System.out.println("dogs bark");
}
}

class BabyDog extends Dog1{

    void weeping(){
        System.out.println("babydog is weeping...help!!!");
    }
}




public class MultilevelInheritance
{
    public static void main(String[]args){

        BabyDog babyDog=new BabyDog();

        babyDog.weeping();
        babyDog.bark();
        babyDog.eat();
    }
}
