package com.ibm;

class Happy extends Thread{

    public void run(){
       // System.out.println("HEllooo...i am in happy class");

for(int i=0;i<10;i++){

    System.out.println(i+" "+"i am in happy class");
}
    }
}
class Sad extends Thread{
    public void run(){
        //System.out.println("Hello..I am in sad class");

        for(int i=0;i<10;i++){
            System.out.println(i+" "+"I am in sad class");
        }
    }
}
public class Multithreading3
{
    public static void main(String[] args) {

        Happy happy=new Happy();
        happy.start();

        Sad sad=new Sad();
        sad.start();


        happy.setPriority(10); //setting priority...more priority
        sad.setPriority(1);
    }
}
