/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-28
 * Time: 14:13
 */
public class Day5 {
    /*连续字数的最大和
 dp[i] 就是以数组下标为 i 的数做为结尾的最大子序列和，注意是以 i 为结尾，比如说现在有一个数组
{6,-3,-2,7,-15,1,2,2}，dp[2]就是以-2为结尾的，那么显然dp[3]的最大值就是1咯（6，-3，-2），dp[3]要以7结
尾那么以7结尾的子序列最大和就是8（6，-3，-2，7）。现在我们开始细细品一下上面这个递推式，求dp[i]的
时候是不是有两种可能，要么就是像上面的dp[3]一样，dp[2]求出来是1了，再加上自己array[3]是最大的，那
么还有一种可能就是说如果dp[2]我求出来是-100，那如果我也是dp[2]+array[3]的话是-93， 这时候dp[2]反而
是累赘，最大就是自己（因为前面定义了必须以i为结尾，也就说必须以7结尾）。
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []ret=new int[n];
        for (int i=0;i<n;i++){
            ret[i]=sc.nextInt();
        }

        int sum=ret[0];//当前子数组的最大值
        int max= ret[0];//整个数组的最大值

        for(int i=1;i<n;i++){
            sum  =Math.max(ret[i],ret[i]+sum);
            max =Math.max(max,sum);
        }
        System.out.println(max);
    }
}

“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。
花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。
现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，
帮助她寻找有多少种插入办法可以使新串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
例如：
A = “aba”，B = “b”。这里有4种把B插入A的办法：
* 在A的第一个字母之前: "baba" 不是回文
* 在第一个字母‘a’之后: "abba" 是回文
* 在字母‘b’之后: "abba" 是回文
* 在第二个字母'a'之后 "abab" 不是回文
所以满足条件的答案为2

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String s1=sc.nextLine();
        String s2 = sc.nextLine();
        int count= 0;
        int len = s1.length();
        for( int i = 0; i <= len ; i++){
            StringBuffer temp=new StringBuffer(s1);
            temp.insert(i,s2);//将字符串插入

            StringBuffer temp2=new StringBuffer(temp);//因为反转后会改变原来的值,
            //所以要对原值进行保存
            StringBuffer temp3=temp2.reverse();//进行反转
            //转为字符串进行比较
            if( temp3.toString().equals(temp.toString())){
                count ++;
            }

        }
        System.out.println(count);
    }
}

     */


}
