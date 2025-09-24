package org.alex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseWords151
{
  public static String reverseWords(String s) {
    s = s.strip();
    Deque<String> stack = new ArrayDeque<>();
    StringBuilder result = new StringBuilder();

    for(char c : s.toCharArray()){
      if(c != ' '){
        result.append(c);
      }
      else if(result.length() > 0){
        stack.push(result.toString());
        result.setLength(0);
      }
    }

    if(result.length() > 0){
      stack.push(result.toString());
      result.setLength(0);
    }

    while(!stack.isEmpty()){
      result.append(stack.pop());
      if(!stack.isEmpty()){
        result.append(" ");
      }
    }
    return result.toString();
  }

  public static void main(String[] args)
  {
    System.out.println(reverseWords("the sky is blue"));
  }

  //GPT:

  public String reverseWords2(String s) {
    // Step 1: Trim and remove extra spaces
    StringBuilder sb = trimSpaces(s);

    // Step 2: Reverse the whole string
    reverse(sb, 0, sb.length() - 1);

    // Step 3: Reverse each word
    reverseEachWord(sb);

    return sb.toString();
  }

  // Remove leading/trailing spaces and collapse multiple spaces into one
  private StringBuilder trimSpaces(String s) {
    int left = 0, right = s.length() - 1;

    // skip leading spaces
    while (left <= right && s.charAt(left) == ' ') left++;
    // skip trailing spaces
    while (right >= left && s.charAt(right) == ' ') right--;

    StringBuilder sb = new StringBuilder();
    while (left <= right) {
      char c = s.charAt(left);
      if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
        sb.append(c);
      }
      left++;
    }
    return sb;
  }

  // Reverse characters in a StringBuilder
  private void reverse(StringBuilder sb, int left, int right) {
    while (left < right) {
      char tmp = sb.charAt(left);
      sb.setCharAt(left++, sb.charAt(right));
      sb.setCharAt(right--, tmp);
    }
  }

  // Reverse each word in the string
  private void reverseEachWord(StringBuilder sb) {
    int n = sb.length();
    int start = 0, end = 0;

    while (start < n) {
      // find the end of the word
      while (end < n && sb.charAt(end) != ' ') end++;
      // reverse the word
      reverse(sb, start, end - 1);
      // move to next word
      start = end + 1;
      end = start;
    }
  }
}
