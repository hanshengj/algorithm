/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-05-21
 * Time: 22:44
 */
public class Day30 {
    /*

破译密码
    // write your code here
    import java.util.*;
    public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//密码字母
            String str2 = "VWXYZABCDEFGHIJKLMNOPQRSTU";//原文字母
            char ret[] = new char[130];

            for (int i=0;i<str1.length();i++){
                ret[str1.charAt(i)] = str2.charAt(i);
            }

            String ss1 = sc.nextLine();
            int len = ss1.length();
            StringBuffer ss2 = new StringBuffer();
            for (int i=0;i<len;i++){

                if(ss1.charAt(i)==' '){
                    ss2.append(" ");
                }else{
                    ss2.append(ret[ss1.charAt(i)]);
                }
            }
            System.out.println(ss2);
        }
    }
}






求一个整数的因子个数，
// write your code here
import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int count  =0;
            for(int i = 2; i*i <=n;i++){
                if(n % i == 0){
                    count++;
                    n /=i;
                }
                //这个for循环是为了去除相同的因子
                while(n % i==0){
                    n /= i;
                }
                //退出循环表这个因子已经去除完了，开始找下一个因子
            }
            //判断此时的n是否也是一个因子
            if(n !=1){
                count++;
            }
            System.out.println(count);
        }
    }
}
     */
}
