import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-23
 * Time: 21:21
 */
public class Day12 {
    /*
    输入两个整形数字n,m,将m的二进制数位插入到n的二进制数位的给定区间值j--i中

     public int binInsert(int n, int m, int j, int i) {
        // write code here
        //先将要要插入的数m像右移动j位，使得m,n的二进制字符串靠右对齐
        m=m<<j;
        //将移动后的m,与n进行按位或运算；
        return n | m;
    }
     */
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int half=n/2,n1=0,n2=0;//两个素数一个比输入数的一半小，一个比一半大
        //素数对差最小，要从一半开始像两边找
        for(int i=half;i>0;i--){
            if(isPrime(i)){
                if(isPrime(n-i)){
                    n1=i;
                    n2=n-i;
                    break;
                }
            }
        }
        System.out.println(n1);
        System.out.println(n2);
    }
    //判断素数函数
    public static boolean isPrime(int n){
        boolean ret=true;
        for(int i=2;i*i<=n;i++){
            if((n%i)==0){
                ret=false;
                break;
            }
        }
        return ret;
    }
}
