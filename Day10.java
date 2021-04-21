/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-21
 * Time: 22:11
 */
public class Day10 {
    /*
求给定数，距离最近的斐波那契额数需要走几步

    import java.util.*;
     public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int num=0;//表示当前的斐波那契额数
        int last1=0,last2=1;//last1表示第一个数，last2表示第二个数
        while(num<n){
            num=last1+last2;

            last1=last2;
            last2=num;
        }
        //退出循环，last2指向比n大的斐波那契数，last1比n小的那个斐波那契数
        int ret=Math.min(n-last1,last2-n);
        System.out.println(ret);
    }
}


机器人走方格的方法有多少中走法
import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if(x==1||y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }
}

     */
}
