
养兔子
// write your code here
import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long n = sc.nextInt();
            System.out.println(sum(n));
        }
    }
    public static long sum(long n){
        long num1=1,num2=2;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        long num=3,result=0;
        while(num<=n){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            num++;
        }
        return result;
    }
}