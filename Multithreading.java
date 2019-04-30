package com.ibm;

public class Multithreading extends Thread
{
    public void run(){
        System.out.println("thread is in running state");
    }
    public static void main(String[] args) {


        Multithreading multithreading=new Multithreading();
        multithreading.start();



    }
}
