package HackerRank;

import java.util.Scanner;

/**
 * Created by changwooj111@gmail.com on 2018. 4. 19.
 * Blog : http://woo-repository.tistory.com/
 * Github : https://github.com/changwoojang
 */
public class DFSConnectedCellGrid {
    public static int getBiggestRegion(int[][] matrix) {
        int max = 0 ;
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                max = Math.max(max,countCell(matrix,i,j));
            }
        }
        return max;
    }
    public static int countCell(int[][] matrix, int i , int j){
        // System.out.println(matrix.length);
        if( i < 0 || j < 0 || matrix.length <= i || matrix[0].length <= j )
            return 0;

        if(matrix[i][j] == 0)
            return 0;

        int count = 1 ;
        matrix[i][j] = 0 ;

        count += countCell(matrix,i-1,j);
        count += countCell(matrix,i+1,j);
        count += countCell(matrix,i,j+1);
        count += countCell(matrix,i,j-1);
        count += countCell(matrix,i-1,j-1);
        count += countCell(matrix,i+1,j+1);
        count += countCell(matrix,i-1,j+1);
        count += countCell(matrix,i+1,j-1);

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
