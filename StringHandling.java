package com.ibm;

public class StringHandling
{
    public static void main(String[]args)throws Exception
    {
        char ch[]=new char[10];

        for(int i=0;i<ch.length;i++){
            ch[i]=(char)System.in.read();
        }
    }
}
