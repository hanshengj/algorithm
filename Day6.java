/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-05-02
 * Time: 16:05
 */
public class Day6 {

    /*




    二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。


    import java.util.*;
     public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int  m = sc.nextInt();
        int n = sc.nextInt();
        int  ret[][] = new int[m][n];//初始值都为0
        int count = 0;//可以放的蛋糕数量
        for(int i = 0 ;i < m ; i++){
            for(int j = 0 ;j < n ; j++){
                if(ret[i][j] != 2){//若这个地方不是2，则表示可以放蛋糕
                    count++;
                    //放完蛋糕后，该位置往右两个距离不能再放蛋糕了，
                    //往下两个位置也不能再放蛋糕了
                    if(i+2 < m){
                        ret[i+2][j] =2;
                    }
                    if(j+2 < n){
                        ret[i][j+2]=2;
                    }
                }
            }
        }
        System.out.println(count);
    }
}



将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
public class Solution {
    public int StrToInt(String str) {
        //判断输入的字符串是否有效
        if(str == null || str.isEmpty()){
            return 0;
        }

        //判断是不是只有一个+或者-
        int num = 0;
        int len = str.length();
        if(len == 1){
            if (str.charAt(0) == '+' || str.charAt(0) == '-'){
                return 0;
            }
        }

        boolean flag=false;//记录是否为负数
        for(int i = 0;i < len ;i++){
            //先判断是否为数字
            if(Character.isDigit(str.charAt(i))){
            //也可以改为
            //if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                num *=10;
                int temp = str.charAt(i) - '0';
                 num += temp;
            }else{//不是数字
                //判断是否为负号
                if(str.charAt(0)=='-' || str.charAt(0)=='+'){
                    if(str.charAt(0)=='-'){
                        flag=true;
                    }
                    }else{//不是正负号，说明是一个无效的字符串
                    return 0;
                }
            }
        }
          if(flag){
              return -num;
          }else{
              return num;
          }
    }
}
     */
}
