package org.alex;


import java.util.Arrays;


public class ReverseString344
{
  public static void reverseString(char[] s) {
    int pointer1 = 0;
    int pointer2 = s.length - 1;

    while (pointer1 < pointer2) {
      char temp = s[pointer1];
      s[pointer1] = s[pointer2];
      s[pointer2] = temp;
      pointer1++;
      pointer2--;
    }
  }


  public static void main(String[] args)
  {
    char[] s = {'h','e','l','l','o'};
    reverseString(s);
    System.out.println(Arrays.toString(s));
  }
}
