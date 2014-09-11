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

    public String SentenceReverse(String sentence){

        String reverse = "";
        String[] words = sentence.split("\\s");
        int wordCount = words.length;

        for (int i =0; i < wordCount; i++){
            reverse = reverse + StringReverse(words[i]);
        }

        return reverse;
    }
}
