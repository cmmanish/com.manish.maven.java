package com.manish.maven.java;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Hello world!
 */
public class App {

    public boolean binarySearch(int[] a, int key) {

        boolean flag = false;
        int mid = a.length / 2;
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {

            if (key > a[mid]) {
                low = mid + 1;
            }
            else if (key < a[mid]) {
                high = mid - 1;
            }
            else {
                flag = true;
            }

            mid = (low + high) / 2;
        }

        return flag;
    }

    public int[] bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int tempVar = numbers[j + 1];
                    numbers[j + 1] = numbers[i];
                    numbers[i] = tempVar;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        return numbers;

    }

    public String capitalizeFirstLetters(String str) {

        String words[] = str.split(" ");

        for (String word : words) {
            if (word.length() > 1) {

                char ch = word.charAt(0);
                if (!Character.isDigit(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                StringBuffer sb = new StringBuffer(word);
                sb.setCharAt(0, ch);
                str = str.replace(word, sb.toString());

            }
        }
        return str;

    }

    public boolean isPalindrome(String str) {

        if (null == str || str.matches("\\s*")) {
            return false;
        }

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        if (str.equalsIgnoreCase(rev)) {
            return true;
        }
        else {

            return false;
        }
    }

    public int[] removeDuplicates(int[] array) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        for (int a : array) {
            lhs.add(new Integer(a));
        }

        lhs.toArray();

        return array;

    }

    public String replaceWordsInSentence(String sentence) {

        String[] array = sentence.split("[\\s*]");

        for (String str : array) {
            StringBuffer sb = new StringBuffer(str);
            sentence = sentence.replace(str, sb.reverse().toString());
        }
        return sentence;
    }

    public String StringBufferReverse(String str) {

        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();


    }

    public int Factorial(int n) {

        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }
        else {
            return n * Factorial(n - 1);
        }

    }

    public int Fibonachi(int n) {

        if (n == 1 || n == 2)
            return 1;

        int fibi = 1, fib1 = 1, fib2 = 1;

        for (int i = 3; i < n; i++) {

            fibi = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibi;

        }

        return fibi;

    }


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