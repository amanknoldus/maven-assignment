package com.knoldus;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class StringInput {
    public static void main (String[] args)
        //getting Input from User and throws error if any input/output error occurs.
            throws IOException
    {
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Enter Your Sentence: ");
        String userString = readInput.readLine();
        ReverseLength stringObject = new ReverseLength();

        //method called to reverse the String.
        System.out.print("Reversed String is: ");
        stringObject.reverseString(userString);

        //method called to get length of String.
        System.out.println("\nLength of String is: " + stringObject.getStringLength(userString));
    }
}
