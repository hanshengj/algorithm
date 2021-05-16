
给定一个由非负整数填充的m x n的二维数组，现在要从二维数组的左上角走到右下角，请找出路径上的所有数字之和最小的路径。
注意：你每次只能向下或向右移动



import java.util.*;
public class Solution {
    /**
     * 
     * @param grid int整型二维数组 
     * @return int整型
     */
    public int minPathSum (int[][] grid) {
        // write code here
        int row = grid.length;
        int col = grid[0].length;
        //初始化第一行与第一列
        for (int i=1; i<row ;i++){
            //第一列只能向下走，只用当前值加上前面的值即可
            grid[i][0]= grid[i][0] + grid[i-1][0];
        }
        for (int i=1; i<col ;i++){
            //第一行只能像左走，所以只用前面的值加上当前值即可
            grid[0][i]= grid[0][i] + grid[0][i-1];
        }
        
        //遍历数组，将每个点的最小路径和存入，第一行第一列已经统计过了所以直接从1开始
        for (int i=1;i<row;i++){
            for (int j=1;j<col;j++){
                //当前路径的最小和等于上一步的最小和加上当前的值
                grid[i][j]= Math.min(grid[i-1][j],grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }
}