import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-25
 * Time: 20:05
 */
public class Day13 {
    /*
    拆分字符串
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String ss = sc.nextLine();
                int count = 0;
                StringBuffer ret = new StringBuffer();
                Set<StringBuffer> set=new HashSet<>() ;

                for (int i = 0; i < ss.length(); i++) {
                    if (ss.charAt(i) == '\"') {
                        i++;
                        while (i < ss.length() && (ss.charAt(i) != '\"')) {
                            ret.append(ss.charAt(i));
                            i++;
                        }
                        //System.out.println(ret);
                        set.add(ret);
                        ret = new StringBuffer();
                        //i++;
                    } else if (ss.charAt(i) != ' ') {
                        if (ss.charAt(i) != ' ') {
                            while (i < ss.length() && (ss.charAt(i) != ' ')) {
                                ret.append(ss.charAt(i));
                                i++;
                            }
                            //System.out.println(ret);
                            set.add(ret);
                            ret = new StringBuffer();
                        }
                    } else {
                        continue;
                    }
                }
                System.out.println(set);
            }
        }




 小易跳石板
import java.util.Scanner;
import java.lang.Math;
import java.lang.Integer;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        //如果是同一个位置，直接返回0
        if(n==m)
        {
            System.out.println(0);
            return;
        }
        int[] dp=new int[m+1]; //用于动规的记录表，dp[i]记录从n号石板跳到i号石板的最少步数，
        //dp[i]=Integer.MAX_VALUE时为不可达,先设所有位置都不可达
        for(int i=0;i<=m;i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }

        dp[n]=0;
        for(int i=n;i<m;i++)
        {
            if(dp[i]==Integer.MAX_VALUE) {//不可达
                continue;
            }

            for(int j=2;(j*j)<=i;j++)
            {
                if(i%j==0) //j是i的约数
                {
                    if(i+j<=m)
                    {
                        dp[i+j]=Math.min(dp[i+j],dp[i]+1);
                    }
                    if(i+(i/j)<=m)
                    {
                        dp[i+(i/j)]=Math.min(dp[i+(i/j)],dp[i]+1);
                    }
                }
            }
        }
        if(dp[m]==Integer.MAX_VALUE)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(dp[m]);
        }

    }
}

     */

    }

