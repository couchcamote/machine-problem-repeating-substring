package com.alexiesracca.sandbox;

public class App 
{
    public static void main(String[] args) {
    System.out.println("abcabc > " + repeatingSubstring("abcabc"));
    System.out.println("abcdef > " + repeatingSubstring("abcdef"));
    System.out.println("abcdefabc > " + repeatingSubstring("abcdefabc"));

	}

    public static String repeatingSubstring(String baseString){
        for(int i=0;i<baseString.length();i++){
            if(i==baseString.length()-1){
                return baseString;
            }
            else if(baseString.length()%(i+1)==0){
                int length = i+1;
                if(baseString.substring(0, i+1).equals(baseString.substring(i+1, i+1+length))){
                    return baseString.substring(0, i+1);
                }
            }
        }
        return baseString;
    }

}
