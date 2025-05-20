package org.alex;

import java.util.HashMap;

public class WordPattern290 {

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s");
        HashMap<String, String> patternByWords = new HashMap<>();
        StringBuilder result = new StringBuilder();
        char letter = pattern.charAt(0);

        for(String word : words){
            if(patternByWords.containsKey(word)){
                result.append(patternByWords.get(word));
            }
            else{
                result.append(letter);
                patternByWords.put(word, String.valueOf(letter));
                letter++;
            }
        }
        return result.toString().equals(pattern);
    }

    public static void main(String[] args) {
        String pattern = "deadbeef";
        String s = "d e a d b e e f";
        System.out.println(wordPattern(pattern, s));
    }
}

