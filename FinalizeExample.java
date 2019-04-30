<<<<<<< HEAD
package com.ibm;

public class FinalizeExample
{
    public void finalize()
    {
        System.out.println("finalize called");
    }
    public static void main(String[] args) {


                FinalizeExample f1=new FinalizeExample();
                FinalizeExample f2=new FinalizeExample();
                f1=null;
                f2=null;
                System.gc();
            }

    }

=======
package com.ibm;

public class FinalizeExample
{
    public void finalize()
    {
        System.out.println("finalize called");
    }
    public static void main(String[] args) {


                FinalizeExample f1=new FinalizeExample();
                FinalizeExample f2=new FinalizeExample();
                f1=null;
                f2=null;
                System.gc();
            }

    }

>>>>>>> 9c1d42922061c20a11c54ff8257ec79787985e1f
