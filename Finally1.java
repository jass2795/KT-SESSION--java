<<<<<<< HEAD
package com.ibm;

public class Finally1
{
    public static void main(String[] args) {

        int a=10;

        try{

            int result=a/0;

        }
        catch(Exception exception){
            System.out.println("exception is"+" "+exception);
        }
        finally{
            System.out.println("i am in finally block!!!!..it will always be executed!!");
        }
    }
}
=======
package com.ibm;

public class Finally1
{
    public static void main(String[] args) {

        int a=10;

        try{

            int result=a/0;

        }
        catch(Exception exception){
            System.out.println("exception is"+" "+exception);
        }
        finally{
            System.out.println("i am in finally block!!!!..it will always be executed!!");
        }
    }
}
>>>>>>> 9c1d42922061c20a11c54ff8257ec79787985e1f
