import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-05-13
 * Time: 17:41
 */
public class Day22 {
    /*

    小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为a.
    在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn.
    如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并且使得
    自己的能力值增加bi;如果bi大于c,那他也能打败怪物;但他的能力值只能i增加bi与c的
    最大公约数.那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?

     */
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();//怪物数量
            int c = sc.nextInt();//初始战斗力


            int [] ret = new int[n];
            for (int i=0;i < n;i++){
                ret[i] = sc.nextInt();//每个怪物的战斗力
            }

            for (int i=0;i < n;i++){
                if( ret [i] <= c){
                    c += ret[i];
                }else {
                    int a= divided(ret[i],c);
                    c += a;
                }
            }
            System.out.println(c);
        }
    }

    //求最大公约数
    public static int divided( int n1,int n2){
        while(n1!= 0){
            int temp = n2 % n1;
            n2 = n1;
            n1 = temp;

        }
        System.out.println(n2);
        return n2;
    }
    /*


    找出字符串中第一次只出现一次的字符
    import java.util.*;
     public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String ss = sc.nextLine();
            int len = ss.length();
            int []arr = new int [256];//存放字符出现的次数
            for (int i=0;i<len ;i++){
                int temp = ss.charAt(i);
                arr[temp]++;
            }
            //退出循环，已经将字符出现的次数都存在了数组中，接下来只要按顺序找到出现一次的字符就可以了
            int j = 0;
            for (; j<len ;j++){
                int temp = ss.charAt(j);
                if(arr[temp] ==1){

                    break;
                }
            }
            //退出循环有两种可能，一是找到只出现一次的字符，而是没有找到，下面做个判断
            if(j == len){
                System.out.println(-1);

            }else{
                System.out.println(ss.charAt(j));
            }

        }
    }
}
     */
}
