package com.ibm;

public class Programmer extends Employee
{
    float bonus=10000;
    public static void main(String[] args) {

        Programmer programmer=new Programmer();


        System.out.println("programmer's salary is"+" "+programmer.salary);
        System.out.println("programmer's bonus is"+" "+programmer.bonus);

    }
}
