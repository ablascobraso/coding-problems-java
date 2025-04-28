package org.alex;

import java.util.HashMap;


public class ValidAnagram242
{
  public static boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) {
      return false;
    }

    HashMap<Character, Integer> repsByChar = new HashMap<>();
    for (char c : s.toCharArray()) {
      if(!repsByChar.containsKey(c)){
        repsByChar.put(c, 1);
      }
      else{
        repsByChar.put(c, repsByChar.get(c) + 1);
      }
    }

    for (char c : t.toCharArray()) {
      if(!repsByChar.containsKey(c)){
        return false;
      }
      else{
        if(repsByChar.get(c) > 1){
          repsByChar.put(c, repsByChar.get(c) - 1);
        }
        else{
          repsByChar.remove(c);
        }
      }
    }
    return true;
  }


  public static void main(String[] args)
  {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));
  }
}
