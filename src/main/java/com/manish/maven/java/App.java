package com.manish.maven.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public String StringReverse(String iString){

        String reverse = "";

        if (iString.length() == 1 ){
            return iString;
        }
        else if (iString.length() == 0 || iString.equalsIgnoreCase(" ")){
            return iString;
        }
        else {
            for (int i = iString.length()-1 ; i >= 0 ; i--) {

                reverse = reverse +  iString.charAt(i);
            }

        }

        return reverse;
    }

    public String SentenceReverse(){

        String reverse = "";

        return reverse;
    }
}
