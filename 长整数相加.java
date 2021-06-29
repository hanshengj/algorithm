
请设计一个算法能够完成两个用字符串存储的整数进行相加操作，对非法的输入则返回error


import java.util.*;
public class Main{
  
                   
public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] ret = str.split(" ");
            String s1 = ret[0];
            String s2 = ret[1];
            System.out.println(add(s1,s2));
        }
    }

    public static String add(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        //若有不合法的，直接返回error
        if(!check(c1)||!check(c2)){
            return "error";
        }
        //使c1始终指向最长的字符串
        if(c1.length < c2.length){
            char[] tmp=c1;
            c1=c2;
            c2=tmp;
        }
        //从后向前遍历相加
        int i = c1.length - 1,j = c2.length - 1;
        int jw = 0;//表示进位的大小，一开始没有进位所以大小为0
        //先将短的字符串相加完
        for(; j >=0 ;j-- ,i--){
            int add = c1[i] - '0' + c2[j] - '0' + jw ;
            c1[i] = (char)(add % 10 + '0');
            jw = add /10;
        }
        //遍历长的字符串
        for( ;i >=0 ; i--){
            int add = c1[i] - '0' + jw;
            c1[i] = (char)(add % 10 + '0');
            jw = add / 10;
        }
        //相加完毕，开始拼接返回字符串
        StringBuffer ss = new StringBuffer();
        if(jw != 0){
            ss.append(jw);
        }
        for(int l =0 ; l< c1.length ;l++){
            ss.append(c1[l]);
        }
        return ss.toString();
    }

    public static boolean check(char[] c){
        for (int i = 0; i< c.length ; i++){
            if(c[i] > '9' || c[i] < '0'){
                return false;
            }
                return true;

        }
        return true;
    }
}