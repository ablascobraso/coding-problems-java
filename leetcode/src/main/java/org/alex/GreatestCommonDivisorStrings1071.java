package org.alex;

public class GreatestCommonDivisorStrings1071 {

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int result = euclidean(str1.length(), str2.length());
        return str1.length() > str2.length() ? str1.substring(0,result) : str2.substring(0,result);


    }

    private static int euclidean(int str1Length, int str2Length){
        while(str2Length != 0){
            int temp = str2Length;
            str2Length = str1Length % str2Length;
            str1Length = temp;
        }
        return str1Length;
    }


    public static void main(String[] args) {
        System.out.println("Result:" + gcdOfStrings("ABABAB", "ABAB"));
    }
}
