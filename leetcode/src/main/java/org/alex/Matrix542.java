package org.alex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Matrix542 {

    public static int[][] updateMatrix(int[][] mat) {
        int maxRow = mat.length;
        int maxCol = mat[0].length;

        int[][] distances = new int[maxRow][maxCol];
        Queue<int[]> queue = new LinkedList<>();

        for(int row = 0; row<maxRow; row++){
            for(int col = 0; col<maxCol; col++){
                if(mat[row][col] == 0){
                    distances[row][col] = 0;
                    queue.offer(new int[]{row, col});
                }
                else{
                    distances[row][col] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] movements = {{-1,0},{1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
            for(int[] move : movements){
                int neighbourRow = row + move[0];
                int neighbourCol = col + move[1];
                if((neighbourRow >= 0 && neighbourRow < maxRow)
                        && (neighbourCol >= 0 && neighbourCol < maxCol)){
                    if(distances[neighbourRow][neighbourCol] > distances[row][col]+ 1){
                        distances[neighbourRow][neighbourCol] = distances[row][col] + 1;
                        queue.offer(new int[]{neighbourRow, neighbourCol});
                    }
                }
            }
        }
        return distances;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0,1,1},
                {1,1,1},
                {1,1,1}};
        System.out.println("Result:" + Arrays.deepToString(updateMatrix(mat)));
    }
}
