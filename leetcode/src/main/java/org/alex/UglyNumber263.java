package org.alex;

public class UglyNumber263 {

    public static boolean isUgly(int n) {
        if(n == 0) return false;
        int[] primes = {2, 3, 5};
        while(n != 1){
            for (int i = 0; i <= primes.length; i++){
                if(n % primes[i] == 0){
                    n = n / primes[i];
                    break;
                }
                if(i == primes.length-1){
                    return false;
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
}

