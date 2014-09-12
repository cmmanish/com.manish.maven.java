package com.manish.maven.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public String StringReverse(String iString) {

        String reverse = "";

        if (iString.length() == 1) {
            return iString;
        }
        else if (iString.length() == 0 || iString.equalsIgnoreCase(" ")) {
            return iString;
        }
        else {
            for (int i = iString.length() - 1; i >= 0; i--) {

                reverse = reverse + iString.charAt(i);
            }

        }

        return reverse;
    }

    public String SentenceReverse(String sentence) {

        String reverse = "";
        String[] words = sentence.split("\\s");
        int wordCount = words.length;

        for (int i = 0; i < wordCount; i++) {
            reverse = reverse + StringReverse(words[i]);
        }

        return reverse;
    }

    public String UniqCharacter(String str) {

        String uniq = "";
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (map.get(a) == null) {
                map.put(a, 1);
            }
            else {
                int count = map.get(a);
                count += 1;
                map.put(a, count);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniq = entry.getKey().toString();
            }
        }
        return uniq;
    }
}
