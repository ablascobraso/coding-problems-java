package org.alex;



public class CanPlaceFlowers605
{
  public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int p1 = -1;
    int p2 = 1;

    if(n == 0){
      return true;
    }

    if (flowerbed.length == 1){
      return flowerbed[0] == 0 ? true : false;
    }


    for(int i =0; i < flowerbed.length; i++){
      int isPossible = 0;
      if(p1 == -1 && flowerbed[i] == 0){
        isPossible++;
      }
      else if(p1 != -1 && flowerbed[i] == 0 && flowerbed[p1] != 1){
        isPossible++;
      }
      if(p2 == flowerbed.length && flowerbed[p1] == 0){
        isPossible++;
      }
      else if(p2 < flowerbed.length && flowerbed[i] == 0 && flowerbed[p2] != 1){
        isPossible++;
      }
      if(isPossible == 2){
        flowerbed[i] = 1;
        n--;
      }
      p1++;
      p2++;
    }
    return n <= 0;
  }


  public static void main(String[] args)
  {
    int[] flowerbed = {1,0,0,0,1,0,0};
    System.out.println(canPlaceFlowers(flowerbed, 2));
  }
}
