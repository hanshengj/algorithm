
搜狐员工小王最近利用假期在外地旅游，在某个小镇碰到一个马戏团表演，精彩的表演结束后发现团长正和大伙在帐篷前激烈讨论，
小王打听了下了解到， 马戏团正打算出一个新节目“最高罗汉塔”，即马戏团员叠罗汉表演。考虑到安全因素，要求叠罗汉过程中，
站在某个人肩上的人应该既比自己矮又比自己瘦，或相等。 团长想要本次节目中的罗汉塔叠的最高，由于人数众多，正在头疼如何
安排人员的问题。小王觉得这个问题很简单，于是统计了参与最高罗汉塔表演的所有团员的身高体重，并且很快找到叠最高罗汉塔的
人员序列。 现在你手上也拿到了这样一份身高体重表，请找出可以叠出的最高罗汉塔的高度，这份表中马戏团员依次编号为1到N。

import java.util.*;
//定义一个节点类，用来存储一个人的身高和体重，
//并重写比较方法，先按体重升序排序，如果体重相等，就按身高降序排序
 class node implements Comparable<node>{
    int w;
    int h;
    public node(int w,int h){
        this.w = w;
        this.h = h;
    }
    public int compareTo(node o){
        int ret = w - o.w;
        if(ret == 0){
            ret =  o.h - h;
        }
        return ret;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            node [] ret = new node [n];
            for(int i = 0; i < n ;i++){
                sc.nextInt();
                ret[i] = new node(sc.nextInt(),sc.nextInt());
            }
            System.out.println(sum(ret,n));
        }
    }
    //求最多可以叠多少人，即求身高的最长升序子序列
    public static  int sum(node[] ret ,int n){
        int[] tp = new int[n];
        Arrays.sort(ret);
        int tol = 0;
        for(int i = 0 ; i < n; i++) tp[i] = 1;
        for(int i = 1 ; i < n; i++){
            for(int j = 0 ; j< i; j++){
                if(ret[j].h <= ret[i].h){
                    tp[i] = Math.max(tp[i],tp[j] + 1);
                }
            }
            tol = Math.max(tol,tp[i]);
        }
        return tol;
    }
}