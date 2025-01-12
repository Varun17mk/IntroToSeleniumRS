package com.RShetty;

public class CoreJava1 {
    public static void main(String[] args) {
        String s = "Varun is 24";
        s.split(" ");
        String [] SplitString = s.split(" ");
        System.out.println(SplitString.length);
        System.out.println(SplitString[0]);
        System.out.println(SplitString[1]);
        System.out.println(SplitString[2]);
//

        // Printing reverse of a string
        for (int i=s.length()-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
    }


}
