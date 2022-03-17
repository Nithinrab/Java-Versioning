package com.harman.calculator;

public class Development {
    public static void main(String[] args) {
        Subtraction subc=new Subtraction();
        int a= 10,b=30,c;
        c=a+b;
        System.out.println(c);
        int result = subc.sub(a,b);
        System.out.println(result);
    }
}
