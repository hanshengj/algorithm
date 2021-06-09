
从CIC++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。
C语言风格使用下划线分隔多个单词，例口""hello_world";而Java则采用—
种叫骆它命名法的规则:除首个单词以外，所有单词的首字母大写，
例如"helloWorld"。请你帮可怜的程序员们自动转换变量名。



// write your code here
import java.util.*;
public class Main{
   public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s= sc.next();
            StringBuffer ret = new StringBuffer();
            int j = -1;
            for(int i = 0;i < s.length();i ++){
                
                if("_".equals(s.charAt(i)+"")){

                    j = i+1;
                    continue;
                }
                if(i==j){
                    //System.out.println(Character.toUpperCase(s.charAt(i)));
                    ret.append(Character.toUpperCase(s.charAt(i)));
                    continue;
                }
                ret.append(s.charAt(i));
            }
            System.out.println(ret.toString());
        }
    }
}