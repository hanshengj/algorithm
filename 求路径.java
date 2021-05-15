
一个机器人在m×n大小的地图的左上角（起点）。
机器人每次向下或向右移动。机器人要到达地图的右下角（终点）。
可以有多少种不同的路径从起点走到终点？

备注：m和n小于等于100,并保证计算结果在int范围内


import java.util.*;
public class Solution {
    /**
     * 
     * @param m int整型 
     * @param n int整型 
     * @return int整型
     */
    public int uniquePaths (int m, int n) {
        // write code here
        
        int [][]ret = new int[n][m];
        //第一行第一列的时候都只有一种方法，所以将他们都赋值为1
        for (int i=0;i< n;i++){
            ret [i][0]=1;
        }
        for (int i=0;i< m;i++){
            ret [0][i]=1;
        }
        //遍历数组，当前方法数等于它的左边点的方法数加上右边点的方法数
        for(int i=1;i<n;i++){
            //第一行第一列都赋值过了，直接从第二行开始
            for (int j=1;j<m;j++){
                ret[i][j] = ret[i-1][j] + ret[i][j-1];
            }
        }
        //返回终点值，这里减一是因为数组的下标是从0开始的
        return ret[n-1][m-1];
    }
}