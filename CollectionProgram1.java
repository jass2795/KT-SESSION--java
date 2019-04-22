package com.ibm;
import java.util.*;
public class CollectionProgram1
{
    CollectionProgram1(){
        System.out.println("i am in constructor1");
    }
    public static void main(String[] args)
    {
        CollectionProgram1 cp=new CollectionProgram1();
                   //implementing dequeue

        Deque<String> sq=new ArrayDeque<>();
        sq.add("India");
        sq.add("China");
        sq.add("pakistan");

        Iterator itr6=sq.iterator();
        while(itr6.hasNext())
        {
            System.out.println(itr6.next());
        }

        sq.addFirst("this string was added at the first position");
        sq.addLast("this string was added at the last position");

        for(String str1:sq){
            System.out.println(str1);
        }
        //implementing queue

//        Queue<String    > q1=new PriorityQueue<>();
//        q1.add("jasleen");
//        q1.add("shivani");
//        q1.add("rajat");
//        q1.add("madhu");
//        Iterator itr=q1.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//
//        }
//        System.out.println("peek  element"+ q1.peek());
//        System.out.println("head element" +" "+ q1.element());
//
//        System.out.println("after removing two element");
//
//        q1.poll();
//        q1.remove();
//        Iterator itr1=q1.iterator();
//        while(itr1.hasNext()){
//            System.out.println(itr1.next());
//        }

//        List<Integer> list1=new ArrayList<>();
//        List<String>  list2=new LinkedList<>();
//          list1.add(12);
//          list1.add(13);
//          list1.add(14);
//
//          list2.add("jasleen");
//          list2.add("rajat");
//          list2.add("madhu");
//          list2.add(0,"shivani");
//
//
//        System.out.println(list1 + " "+ list2);
//
//        Iterator itr1=list1.iterator();
//        Iterator itr2=list2.iterator();
//        while(itr1.hasNext())
//        {
//            System.out.println(itr1.next());
//        }
//
//        while(itr2.hasNext())
//        {
//            System.out.println(itr2.next());
//        }
                                    //implementing vector
//        Vector v1=new Vector();
//        v1.add("shinchan");
//        v1.add("doraemon");
//        v1.add(12);
//        v1.add("chhota bheem");
//
//         Iterator itr=v1.iterator();
//         while(itr.hasNext())
//         {
//             System.out.println(itr.next());
//         }

                     //implementing stack 1
//        Stack st=new Stack();
//        st.push("jasleen");
//        st.push(1);
//        st.push("guneet");
//        st.push(2);
//
//        Iterator itr=st.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println("now after pushing the elements, we will pop ");
//        st.pop();
//        Iterator itr1=st.iterator();
//        while(itr1.hasNext()){
//            System.out.println(itr1.next());
//        }

                                //implementing stack 2

//        Stack<Integer> st=new Stack<>();
//        st.push(12);
//        st.push(13);
//        st.push(14);
//
//        Iterator it1=st.iterator();
//
//        while(it1.hasNext())
//        {
//            System.out.println(it1.next());
//        }



    }
}
