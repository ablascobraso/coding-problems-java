package org.alex;

public class AddDigits258 {

    public static int addDigits(int num) {
        while(String.valueOf(num).length() > 1){
            int temp = 0;
            for(char c : String.valueOf(num).toCharArray()){
                temp = temp + (c - '0');
            }
            num = temp;
        }
        return num;
    }



    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}

