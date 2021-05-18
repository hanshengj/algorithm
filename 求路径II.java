
题目描述
继续求路径。
如果在图中加入了一些障碍，有多少不同的路径？
分别用0和1代表空区域和障碍
例如
下图表示有一个障碍在3*3的图中央。
[
    [0,0,0],
    [0,1,0],
    [0,0,0]
]
有2条不同的路径
备注：m和n不超过100.


import java.util.*;
public class Solution {
    /**
     * 
     * @param obstacleGrid int整型二维数组 
     * @return int整型
     */
    public int uniquePathsWithObstacles (int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int ret [][] = new int[row][col];//存放当前节点能到达的路径数
        // write code here
        for (int i=0;i<row;i++){
            //先将第一列能到达的路径树保存
            if(obstacleGrid[i][0]==0){
                ret[i][0]= 1;//表示没有障碍物，可以走
            }else{
                break;//有障碍物
            }
        }
        
        for (int i=0;i<col;i++){
            //将第一行能到达的路径树保存
            if(obstacleGrid[0][i]==0){
                ret[0][i]= 1;//表示没有障碍物，可以走
            }else{
                break;//有障碍物
            }
        }
        
        //遍历整个数组,第一行第一列都已经统计过了，下面就不在统计了。所以不从0开始
        for (int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(obstacleGrid[i][j]==0){
                    ret[i][j]= ret[i-1][j] + ret[i][j-1];
                }
            }
        }
        //返回
        return ret[row-1][col-1];
    }
}