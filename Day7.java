/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-18
 * Time: 21:36
 */
public class Day7 {
    /*
    给定两个数，求最小公倍数
    import java.util.*;
public class Main{
    public static void main(String[]args){

        Scanner sc=new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //先判断为0的情况
        if(num1==0){
            System.out.println(num2);
            return;
        }
        if(num2==0){
            System.out.println(num2);
            return;
        }
        //利用辗转相除法
        //r表示余数，n1表示被除数，n2表示除数；
        int r=0,n1=num1,n2=num2;
        while(n2!=0){
            r=n1%n2;
            n1=n2;
            n2=r;
        }
        //退出循环则找到了最大公因数
        //直接输出最小共倍数
        System.out.println(num2*num1/n1);
    }
}
     */

    /*
    不要2，放蛋糕，要求放蛋糕的位置的欧几里得距离不能等于2
    求在给定行列的情况下，能放多少蛋糕
    import java.util.*;
public class Main{
    public static void main(String[]args){
        //先读入行与列，并创建二维数组
        Scanner sc=new Scanner (System.in);
        int col=sc.nextInt();
        int row =sc.nextInt();
        int [][]ret=new int [row][col];
        int count=0;
        //如果该位置的值不是是2，则可以放一个蛋糕
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(ret[i][j]!=2){
                    count ++;//如果该位置的值不是是2，则可以放一个蛋糕
                    if(i+2<row){//方蛋糕的位置向下走两行，如果没有益处，就赋值为2，表示这个位置不能放蛋糕了
                        ret[i+2][j]=2;
                 }
                    if(j+2<col){//方蛋糕的位置向右走两列，如果没有益处，就赋值为2，表示这个位置不能放蛋糕了
                        ret[i][j+2]=2;
                    }
                }
          }
        }
        System.out.println(count);
    }
}
     */

}
