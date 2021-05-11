洗牌在生活中十分常见，现在需要写一个程序模拟洗牌的过程。现在需要洗2n张牌，
从上到下依次是第1张，第2张，第3张一直到第2n张。首先，我们把这2n张牌分成两堆，
左手拿着第1张到第n张（上半堆)，右手拿着第n+1张到第2n张(下半堆)。
接着就开始洗牌的过程，先放下右手的最后—张牌，再放下左手的最后一张牌，
接着放下右手的倒数第二张牌，再放下左手的倒数第二张牌，直到最后放下左手的第一张牌。
接着把牌合并起来就可以了。例如有6张牌，最开始牌的序列是1,2,3,4,5,6。首先分成两组，
左手拿着1,2,3;右手拿着4,5,6。在洗牌过程中按顺字放下了6,3,5,2,4,1。把这六张牌再次合成
—组牌之后，我们按照从上往下的顺序看这组牌，就变成了序列1,4,2,5,3,6。现在给出—个
原始牌组，请输出这副牌洗牌k次之后从上往下的序列。


import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();//数据组数
            while (t > 0){
                t--;
                int n = sc.nextInt();//牌数的一半
                int k = sc.nextInt();//表示要洗几次排
                
                int [] arr = new int [2*n];//存放2n张牌
                for(int i = 0; i< 2*n ;i++){
                    arr[i] = sc.nextInt();//读入牌数
                }
                
                int []res = new int [2 * n];
                 while (k > 0){//洗k次牌
                     res = getRes(arr,n);//调用洗牌函数
                     arr = res;
                     k--;
                     
                 }
                
                //牌洗完后进行输出
                for (int i= 0;i <2*n;i++){
                    if( i == 2*n -1){
                        //最后一个要换行
                        System.out.println(res[i]);
                        break;
                    }
                    System.out.print(res[i] + " ");
                }
            }
        }
    }
    
    //洗牌函数
    //进行一次洗牌的下标变化为：

    //0  1  2  .........2n-3  2n-2  2n-1（旧的数组）
    //0  n  1  n+1...2n-2   n-1   2n-1（新的数组）
    public static int[] getRes( int [] arr,int n){
        int []res = new int [2*n];
        int k =0;//记录下标
        for (int i= 0;i< n;i++){
            res[k++]=arr[i];
            res[k++]=arr[i+n];
        }
        return res;
    }
}