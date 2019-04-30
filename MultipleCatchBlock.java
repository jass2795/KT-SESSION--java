<<<<<<< HEAD
package com.ibm;

public class MultipleCatchBlock
{
    public static void main(String[] args) {

    int a=10;

    try{
        int result=a/0;
    }
    catch(ArithmeticException e1){
        System.out.println("12314exception is"+" "+e1);
    }
    catch(ArrayIndexOutOfBoundsException e2){
        System.out.println("exception is"+" "+e2);

    }
    catch(Exception exception){
        System.out.println("exception is"+" "+exception);
    }

    }
}
=======
package com.ibm;

public class MultipleCatchBlock
{
    public static void main(String[] args) {

    int a=10;

    try{
        int result=a/0;
    }
    catch(ArithmeticException e1){
        System.out.println("12314exception is"+" "+e1);
    }
    catch(ArrayIndexOutOfBoundsException e2){
        System.out.println("exception is"+" "+e2);

    }
    catch(Exception exception){
        System.out.println("exception is"+" "+exception);
    }

    }
}
>>>>>>> 9c1d42922061c20a11c54ff8257ec79787985e1f
