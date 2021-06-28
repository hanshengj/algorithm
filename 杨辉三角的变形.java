
以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。

求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。

输入n(n <= 1000000000)
本题有多组输入数据，输入到文件末尾，请使用while(cin>>)等方式读入

import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();//行数
            int m = 2 * n -1;//列数
            int ret[][] = new int [n][m];
//             for(int i=0;i<n;i++){ 
//                 for(int j=0;j<m;j++){ 
//                     ret[i][j]=0; 
//                 } 
//             }
            ret[0][0] = 1;
            for(int i = 1; i < n ; i++){
                ret[i][0] = ret[i][2*i] = 1;
                for(int j = 1; j< 2*i; j++){
                    if(j==1){
                        ret[i][j] = ret [i-1][j] + ret[i-1][j-1];
                        
                    }else{
                        ret[i][j] = ret[i-1][j] + ret[i-1][j-1]+ ret[i-1][j-2];
                    }
                }
            }
            int i = 0;
            for(;i< m ;i++){
                if(ret[n-1][i] % 2 ==0){
                    System.out.println(i + 1);
                    break;
                }
            }
            if(i == m){
                System.out.println(-1);
            }
        }
    }
}