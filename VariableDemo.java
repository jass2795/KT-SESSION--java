package com.ibm;

public class VariableDemo
{
    //int  count=0; //will get memory when instance is created
     static int count=0; //will get memory only once and it retains its value

    public void increment()

    {
        count++;
    }
    public static void main(String args[])
    {
        VariableDemo obj1=new VariableDemo();
        VariableDemo obj2=new VariableDemo();
        VariableDemo obj3=new VariableDemo();
        VariableDemo obj4=new VariableDemo();

        obj1.increment();
        obj2.increment();
        obj3.increment();
        obj4.increment();



        // Get the Java runtime

        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
        System.out.println("Obj3: count is="+obj3.count);
        System.out.println("Obj4: count is="+obj4.count);

//        System.out.println("Obj1: count is="+VariableDemo.count);
//        System.out.println("Obj2: count is="+VariableDemo.count);
//        System.out.println("Obj1: count is="+VariableDemo.count);
//        System.out.println("Obj2: count is="+VariableDemo.count);


        Runtime runtime = Runtime.getRuntime();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
    }

}
