package com.knoldus;
class ReverseLength {
    //method for reversing a String.
    public void reverseString(String userString) {
        if((userString==null) || (userString.length() <= 1))  System.out.print(userString);
        else{
           System.out.print(userString.charAt(userString.length()-1));
           reverseString(userString.substring(0,userString.length()-1));
        }
    }
    //method for returning length of String.
    public int getStringLength(String userString) {
        int stringLength = 0;
        for (char stringCount: userString.toCharArray()) {
            stringLength++;
        }
        return stringLength;
    }
}
