import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-26
 * Time: 23:02
 */
public class Day15 {
    /*
    输入年月日，求这是这一年的第多少天
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            //若不满足基本的年月日，则直接返回-1
            if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > 31) {
                System.out.println(-1);
                return;
            }
            //定义平年和闰年每月各有多少天
            int[] rep = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int[] norep = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int count = 0;
            //如果是闰年
            if (isrepYear(year)) {
                if (day > rep[month - 1]) {//如果天数大于这个月的最大天数，输入错误
                    System.out.println(-1);
                    return;
                }
                for (int i = 0; i < month - 1; i++) {
                    count += rep[i];
                }
                //将输入月的前面每个月加了，然后加上当月的第几天
                count += day;
                System.out.println(count);
            } else {//平年
                if (day > norep[month - 1]) {//如果天数大于这个月的最大天数，输入错误
                    System.out.println(-1);
                    return;
                }
                for (int i = 0; i < month - 1; i++) {
                    count += norep[i];
                }
                //将输入月的前面每个月加了，然后加上当月的第几天
                count += day;
                System.out.println(count);
            }
        }
    }

    //判断是for为闰年
    public static boolean isrepYear(int year){
        if(year%400==0){
            return true;
        }else{
            if(year%4==0 && year%100!=0){
                return true;
            }
        }
        return false;
    }

     */
}
