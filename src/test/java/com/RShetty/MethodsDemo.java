package com.RShetty;

public class MethodsDemo {
    public static void main(String[] args) {

        System.out.println("Main block executed");
        String s1 = "Varun";
        System.out.println(s1);
        // for non-static method we need to create objects of class to call method
        MethodsDemo M1 = new MethodsDemo();
        M1.MethodDemo1();

        // for static methods no obj creation is needed.
         MethodDemo2();

         // for return type
        MethodsDemo M2 = new MethodsDemo();
        String R1 =  M2.MethodDemo3();
        System.out.println(R1);

    }

    public void MethodDemo1()
    {
        System.out.println("Its void Method 1 ");

    }

    public static void MethodDemo2()
    {
        System.out.println("Its static void Method 2 ");
    }

    public String MethodDemo3()
    {
        System.out.println("Its Method 3 with string type return");
        return "It contains return type";
    }

}
