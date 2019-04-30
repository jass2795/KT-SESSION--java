<<<<<<< HEAD
package com.ibm;
class TestSleepMethod1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}
            System.out.println("Thread 1"+i);
        }
    }
    public static void main(String args[]){
        TestSleepMethod1 t1=new TestSleepMethod1();
        TestSleepMethod1 t2=new TestSleepMethod1();

        t1.start();
        t2.start();
    }
=======
package com.ibm;
class TestSleepMethod1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}
            System.out.println("Thread 1"+i);
        }
    }
    public static void main(String args[]){
        TestSleepMethod1 t1=new TestSleepMethod1();
        TestSleepMethod1 t2=new TestSleepMethod1();

        t1.start();
        t2.start();
    }
>>>>>>> 9c1d42922061c20a11c54ff8257ec79787985e1f
}