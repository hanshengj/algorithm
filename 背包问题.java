有 n 个物品和一个大小为 m 的背包. 给定数组 A 表示每个物品的大小和数组 V 表示每个物品的价值.

问最多能装入背包的总价值是多大?

// public class Solution {
//     /**
//      * @param m: An integer m denotes the size of a backpack
//      * @param A: Given n items with size A[i]
//      * @param V: Given n items with value V[i]
//      * @return: The maximum value
//      */
//     public int backPackII(int m, int[] A, int[] V) {
//         // write your code here
//         int n = A.length;//商品数量
//         if(m== 0 || n== 0){
//             //如果商品数量或者包的大小为0，则不能放东西
//             return 0;
//         }

//         //定义一个二位数组，用来存每个商品对应的包大小时的最大价值
//         int [][]ret = new int [n+1][m+1];//行为商品数，列为背包大小
//         //初始化第一行第一列为0
//         for( int i=0;i<=n;i++){
//             ret[i][0] =0;
//         }
//         for( int i=0;i<=m;i++){
//             ret[0][i] =0;
//         }

//         //商品数量和包的大小与数组ret的下标是对应的
//         //第i个商品在A和V中对应的索引为i-1:
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 //如果这个商品的大小比背包的大小大的时候，则这个商品不放入，
//                 //对应的最大价值是上一个商品对应的价值
//                 if(A[i-1]>j){
//                 ret[i][j]=ret[i-1][j];
//                 }else{
//             //    如果可以装下，分两种情况，装或者不装
//             //    如果不装，则即为(i-1, j)
//             //    如果装，需要腾出放第i个物品大小的空间： j - A[i-1],装入之后的最大价值即为
//             //    (i -1, j - A[i-1]) + 第i个商品的价值V[i - 1],(i -1, j - A[i-1])表示没有装该商品时，背包的最大价值
//             //    最后在装与不装中选出最大的价值
//                 int tempMax = ret[i-1][j-A[i-1]] + V[i-1];
//                 ret[i][j] = Math.max(ret[i-1][j],tempMax);

//             }
//             }
//         }
//         //返回装入前N个商品，物品大小为m的最大价值
//         return ret[n][m];
//     }
// }


/*
优化算法：
上面的算法在计算第i行元素时，只用到第i-1行的元素，所以二维的空间可以优化为一维空间
但是如果是一维向量，需要从后向前计算，因为后面的元素更新需要依靠前面的元素未更新（模拟二维矩阵的上一行的
值）的值
*/

public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @param V: Given n items with value V[i]
     * @return: The maximum value
     */
    public int backPackII(int m, int[] A, int[] V) {
        // write your code here
        int n = A.length;//商品数量
        if(m== 0 || n== 0){
            //如果商品数量或者包的大小为0，则不能放东西
            return 0;
        }      
        int []ret = new int [m+1];//列为背包大小
        //初始化第一行0        
        for( int i=0;i<=m;i++){
            ret[i] =0;
        }
        //商品数量和包的大小与数组ret的下标是对应的
        //第i个商品在A和V中对应的索引为i-1:
        for (int i=1;i<=n;i++){
            for(int j=m;j>=1;j--){
                //如果这个商品的大小比背包的大小大的时候，则这个商品不放入，
                //对应的最大价值是上一个商品对应的价值，所以就不需要在改动了
             
                
//如果第i个商品大于j,说明放不下， 所以(i,j)的最大价值和(i-1,j)相同
 //如果可以装下，分两种情况，装或者不装
 //如果不装，则即为(i-1, j)
 //如果装，需要腾出放第i个物品大小的空间： j - A[i],
 //装入之后的最大价值即为(i - 1, j - A[i-1]) + 第i个商品的价值V[i]
 //最后在装与不装中选出最大的价值
             if(A[i-1]<=j){
                int tempMax = ret[j-A[i-1]] + V[i-1];
                ret[j] = Math.max(ret[j],tempMax);

            }
            }
        }
        //返回装入前N个商品，物品大小为m的最大价值
        return ret[m];
    }
}