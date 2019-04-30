<<<<<<< HEAD
package com.ibm;

public class ExceptionExample
{
    public static void main(String[]args){
        int a=100;
        int arr[]=new int[3];
        try {
            int result = a / 0;
            arr[10]=23;
        }
        catch(ArithmeticException exception){
            System.out.println("exception is"+" "+exception);
        }
        catch(ArrayIndexOutOfBoundsException exception1){
            System.out.println("exception is"+" "+exception1);
        }





        System.out.println("this is the code after try catch block....");

    }
}
=======
package com.ibm;

public class ExceptionExample
{
    public static void main(String[]args){
        int a=100;
        int arr[]=new int[3];
        try {
            int result = a / 0;
            arr[10]=23;
        }
        catch(ArithmeticException exception){
            System.out.println("exception is"+" "+exception);
        }
        catch(ArrayIndexOutOfBoundsException exception1){
            System.out.println("exception is"+" "+exception1);
        }





        System.out.println("this is the code after try catch block....");

    }
}
>>>>>>> 9c1d42922061c20a11c54ff8257ec79787985e1f
