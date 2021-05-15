
题目描述
给出一个三角形，计算从三角形顶部到底部的最小路径和，每一步都可以移动到下面一行相邻的数字，
例如，给出的三角形如下：
[[20],[30,40],[60,50,70],[40,10,80,30]]
最小的从顶部到底部的路径和是20 + 30 + 50 + 10 = 110。
注意：
如果你能只用O（N）的额外的空间来完成这项工作的话，就可以得到附加分，其中N是三角形中的行总数。


//方法一
// 动态规划法，每一层的最短路径就等于上一次的最短路径加上当前的路径，而上一次的最短路径分为三种情况
// 1、当前路径为为左边界 
// 2、当前路径在中间
// 3、当前路径为右边界
// 最后在最后一层取出最小的路径即为结果

// import java.util.*;
// public class Solution {
//     public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
//         if( triangle.isEmpty()){
//             return 0;
//         }
//         int row=triangle.size();
//         ArrayList<ArrayList<Integer>> tempSum = new ArrayList<>();
//         for (int i=0;i<row;i++){
//             tempSum.add(new ArrayList<>());
//         }
        
//         // F[0][0]初始化
//          tempSum.get(0).add(triangle.get(0).get(0));
//         for(int i=1;i<row;i++){
//             //i代表第几行
//             int sum =0;//当前路径的上一次的最短路径
//             for(int j=0;j<=i;j++){
//                 //j代表列
//                 if(j==0){
//                     //j==0表示最左边
//                     sum = tempSum.get(i-1).get(0);
//                 }else if(j==i){
//                     //每一行的最右边
//                     sum = tempSum.get(i-1).get(j-1);
//                 }else{
//                     //中间值
//           sum = Math.min(tempSum.get(i-1).get(j-1),tempSum.get(i-1).get(j));
//                 }
//                 //这一行的最小路径就等于上一次的最小路径加上本次的路径
//             tempSum.get(i).add(sum + triangle.get(i).get(j));
//             }
//         }
        
//         //选取最后一行中最小的路径
//         int ret=tempSum.get(row-1).get(0);
//         for(int i=1;i<row;i++){
//             ret = Math.min(ret,tempSum.get(row-1).get(i));
//         }
//         return ret;
//     }
// }

//方法二
// 直接从下往上遍历，从倒数第二行开始，当前路径的最小值等于当前路径加上后一行的最小值
// 即tempSum[i][j]=math.min(tempSum[i+1][j],tempSum[i+1][j+1]) + tempSum[i][j]
// 最后直接返回第一个值就可以了

import java.util.*;
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if( triangle.isEmpty()){
            return 0;
        }
        int row=triangle.size();
        ArrayList<ArrayList<Integer>> tempSum = new ArrayList<>(triangle);
        for (int i=row-2;i>=0;i--){
            for (int j=0;j<=i;j++){
                int sum = Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1))
                    + triangle.get(i).get(j);
                tempSum.get(i).set(j,sum);
            }
        }
        return tempSum.get(0).get(0);
    }
}