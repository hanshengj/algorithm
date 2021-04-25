/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-24
 * Time: 17:52
 */
public class Day4 {
    /*

    A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道以下的信息：
A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所有题设条件。

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int A,B1,C,B2;
        A=(a+c)>>1;
        B1=(b+d)>>1;
        B2=(c-a)>>1;
        C=(d-b)>>1;
        if(B1==B2){
            System.out.print(A+" "+B2+" "+C);
        }else{
            System.out.print("No");
        }
    }
}


给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        //定义进制数组
        char [] ret=new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer ss=new StringBuffer();
        boolean flag=false;//标记是否为负数
        if(m<0){
            m=-m;
            flag=true;
        }
        //辗转相除
        while(m!=0){
            ss.append(ret[m%n]);
            m/=n;
        }
        if(flag){
            ss.append('-');
        }
        ss.reverse();
        System.out.println(ss.toString());
    }
}
     */
}
