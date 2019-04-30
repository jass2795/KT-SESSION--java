<<<<<<< HEAD
package com.ibm;

public class Multithreading2 implements Runnable
{
    public void run(){
        System.out.println("i am in running state!!!!");
    }
    public static void main(String[] args) {

        Multithreading multithreading=new Multithreading();
Thread t1=new Thread(multithreading);
t1.start();

        multithreading.run();//this is wrong way




    }
}
=======
package com.ibm;

public class Multithreading2 implements Runnable
{
    public void run(){
        System.out.println("i am in running state!!!!");
    }
    public static void main(String[] args) {

        Multithreading multithreading=new Multithreading();
Thread t1=new Thread(multithreading);
t1.start();

        multithreading.run();//this is wrong way




    }
}
>>>>>>> 9c1d42922061c20a11c54ff8257ec79787985e1f
