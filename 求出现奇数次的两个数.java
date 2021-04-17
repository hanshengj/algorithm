
求给定数组中出现奇数次的两个数
import java.util.*;
public class Main{
    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println(0);
        }
        int [] ret=new int[n];
        for(int i=0;i<n;i++){
            ret[i]=sc.nextInt();
        }
        
        //上面的为读入数据的语句
        int num1=0,num2=0,nums=0;
        for(int i=0;i<n;i++){
            nums^=ret[i];
        }
        //跳出循环得到的nums值为这两个出现奇数次数的异或值
        
        //找到从右往左的第一个1的位置
        int index=-1;
        for(int i=0;i<=31;i++){
         if((nums & (1<<i))==1){
             index=i;
             break;
}
        }
        //退出循环则找到了第一个1的位置
        index=1<<index;
        for(int i=0;i<n;i++){
            if((ret[i] & index)==1){
                num1^=ret[i];
           }else{
            num2^=ret[i];
        }
    }
         System.out.println(Math.min(num1,num2) +" "+Math.max(num1,num2));
       
    }
}