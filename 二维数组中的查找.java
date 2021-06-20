在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

       int i = matrix.length - 1, j = 0;//i表示行号，j表示列号

        //从左下角开始找
        while(i >= 0 && j < matrix[0].length){
            if(matrix[i][j] > target){
                //往上移动一行
                i--;
            }else{
                if(matrix[i][j] < target){
                    //往右移动一列
                    j++;
                }else{
                    //相等返回true
                    return true ;
                }
            }

        }
        return false;
    }
}