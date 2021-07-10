nowcoder有两盒（A、B）乒乓球，有红双喜的、有亚力亚的……
现在他需要判别A盒是否包含了B盒中所有的种类，并且每种球的数量
不少于B盒中的数量，该怎么办呢？



import java.util.HashMap;
import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-07-10
 * Time: 22:13
 */
public class bb {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s1;
        String s2;
        HashMap<Character ,Integer> map1 = new HashMap<>();
        HashMap<Character ,Integer> map2 = new HashMap<>();
        while(sc.hasNext()){
            String ret [] = sc.nextLine().split(" ");
            s1 = ret[0];
            s2 = ret[1];
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            //先统计各个字符出现的次数
            for(char c : c1){
                if(map1.containsKey(c)){
                    map1.put(c,map1.get(c) + 1);
                }else{
                    map1.put(c,1);
                }

            }
            for( char c : c2){
                if( map2.containsKey(c)){
                    map2.put(c,map2.get(c) + 1);
                }else{
                    map2.put(c,1);
                }
            }
            //统计完成
            boolean rets = true;
            for (char c : c2) {
                //如果第二个字符串中出现了第一个字符串中没有的字符或者出现的字符的次数大于第一个字符串中出现的次数返回false
                if( !map1.containsKey(c) || map1.get(c) < map2.get(c)){
                    rets = false;
                    break;
                }
                
            }
            if(rets){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
