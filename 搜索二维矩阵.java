编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

每行中的整数从左到右按升序排列。
每行的第一个整数大于前一行的最后一个整数。

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
         //可以看出，该矩阵按行展开是一个升序的数组，可以根据二分查找
        //求得行数m与列数n
        int m = matrix.length, n = matrix[0].length;
        //二分查找，确定左右边界
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;//中间坐标

            //矩阵的横坐标=中间坐标（mid）/列数（n）
            //纵坐标=中间坐标（mid）%列数（n）
            int x = matrix[mid / n][mid % n];
            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
（去掉最后一个条件）
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

class Solution {
    public boolean searchArray(int[][] array, int target) {
        //我们可以每次从矩阵的右上角开始查，因为要炸找的值如果比这个数大，则这一行就不用再看了，
        //因为他们比该值还小，反之之一列就不用看了
        //i表示行，j表示列
        if(array.length<=0 || array[0].length<=0)
        return false;
        int i=0,j=array[0].length-1;
        //如果i超过了最大行数或者j小于了最小列数，则表示矩阵已经空了
        while(i<array.length&&j>=0){
            int x=array[i][j];
            if(x==target){
                return true ;//找到了返回true
            }
            if(target<x)j--;//要查找的值比右上角的值小，则去掉这一列
            else i++;//要查找的值比右上角的值大，则去掉这一行
        }
        return false;
        
    }
}