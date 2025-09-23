package org.alex;


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReverseVowels345
{
  public static String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>(Set.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'));
    Stack<Character> foundVowels = new Stack<>();
    StringBuilder result = new StringBuilder(s);

    for(char c : s.toCharArray()){
      if(vowels.contains(c)){
        foundVowels.push(c);
      }
    }

    for(int i = 0; i<s.length(); i++){
      if(vowels.contains(s.charAt(i))){
        result.setCharAt(i, foundVowels.pop());
      }
    }
    return result.toString();
  }

  public static void main(String[] args)
  {
    System.out.println(reverseVowels("IceCreAm"));
  }

  public static String reverseVowelsOptimized(String s) {
    Set<Character> VOWELS = Set.of(
            'a','e','i','o','u','A','E','I','O','U'
    );
    char[] chars = s.toCharArray();
    int left = 0, right = chars.length - 1;

    while (left < right) {
      // move left pointer to next vowel
      while (left < right && !VOWELS.contains(chars[left])) {
        left++;
      }
      // move right pointer to prev vowel
      while (left < right && !VOWELS.contains(chars[right])) {
        right--;
      }
      // swap
      if (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
      }
    }
    return new String(chars);
  }
}
