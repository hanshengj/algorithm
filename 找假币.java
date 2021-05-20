// write your code here
import java.util.*;
public class Main{
public static void main(String []args){
    Scanner sc = new Scanner (System.in);
    while (sc.hasNext()){
        
        int n = sc.nextInt();
        if(n==0)
            break;
        System.out.println(quickSerch(n));
    }
}
    
    public static int quickSerch(int n){
        int ret = 0;
        while(n!=1){//每次进行称重，称到只有一张硬币为止
            if(n % 3 ==0){ //将他们分散三堆，取出最轻的进行下一轮称重
                n /= 3;
                ret++;
            }else{
                n = n / 3 + 1;
                ret++;
            }
        }
        return ret;
    }
}