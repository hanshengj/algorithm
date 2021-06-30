import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-05-07
 * Time: 23:08
 */
public class Day18 {
    /*

    求每个月兔子的总数
    import java.util.*;
    public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int month = sc.nextInt();
            System.out.println(getTotalCount(month));
        }

    }

    public static int getTotalCount(int mon){
        if(mon ==1 || mon == 2){
            return 1;
        }
        return getTotalCount(mon-1)+getTotalCount(mon-2);
    }
}



     */

//

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            System.out.println(match(str1,str2,0,0));
        }
    }
    public static boolean match(String str1,String str2,int c1,int c2){
        if(str1.length()==c1 && str2.length()==c2){
            return true;
        }
        if(str1.length()==c1 || str2.length()==c2){
            return false;
        }
        if(str1.charAt(c1)=='?'){
            return match(str1,str2,c1+1,c2+1);
        }else if(str1.charAt(c1)=='*'){
            return match(str1,str2,c1+1,c2)||match(str1,str2,c1+1,c2+1)||
                    match(str1,str2,c1,c2 +1); }else if(str1.charAt(c1)==str2.charAt(c2)){
            return match(str1,str2,c1+1,c2+1);
        }else{
            return false;
        }
    }
}

