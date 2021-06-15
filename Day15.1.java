import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-27
 * Time: 21:46
 */
public class Day15 {
    /*

    求一个整数的二进制位有几个1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(findNumberOf1(n));
        }
    }

    public static int findNumberOf1(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }

            num = num >> 1;
        }
        return count;
    }



    取手套
    对于非0递增序列a1,a2...an，要想最终取值覆盖每一个种类 n = sum(a1...an) - a1 + 1（也就是总
数减去最小值之后加一） 所以对于左右手手套颜色都有数量的序列，想要覆盖每一种颜色，则最
小数量leftsum = 左边数量和 - 左边最小值 + 1， rightsum = 右边数量和 - 右边的最小值 + 1。而
对于有0存在的，则需要做累加，保证覆盖每一种颜色。
    public class Gloves {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int sum=0,leftsum=0,rightsum=0;
        int leftmin=26,rightmin=26;
        for(int i=0;i<n;i++){
            //若左右手套有一边没有，则把他全部取出来
            if(left[i]*right[i]==0){
                sum += left[i];
                sum += right[i];
            }else{
                leftsum+=left[i];//统计做手套的数
                rightsum += right[i];//统计有手套的数

                leftmin=Math.min(leftmin,left[i]);//求得左手套的颜色最少的数
                rightmin =Math.min(rightmin,right[i]);//求得右手涛的颜色最少的数
            }

        }
        sum+=Math.min(leftsum-leftmin + 1,rightsum - rightmin +1);
        //这里+1是去掉数量最少的那个颜色，但必须要取一个

        return sum + 1;//这里+1是取得数多的那边至少取一只
    }
}
     */
}
