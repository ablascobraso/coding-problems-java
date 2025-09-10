package org.alex;

public class MergeStringsAlternately1768 {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        while(counter < word1.length() && counter < word2.length()){
            result.append(word1.charAt(counter));
            result.append(word2.charAt(counter));
            counter++;
        }
        if(word1.length() > word2.length()){
            result.append(word1.substring(counter));
        }
        else if(word2.length() > word1.length()){
            result.append(word2.substring(counter));
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println("Result:" + mergeAlternately("abc", "pqrrrr"));
    }
}
