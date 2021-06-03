

Emacs号称神的编辑器，它自带了一个计算器。与其他计算器不同，它是基于
后缀表达式的，即运算符在操作数的后面。例如“2 3 +”等价于中缀表达式的“2 + 3”。
请你实现一个后缀表达式的计算器。

// write your code here
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            Stack<String> ss = new Stack<>();
            String s1 = sc.nextLine();
            String []ret= s1.trim().split(" ");
            for (int i=0;i<n ;i++){
                String s = ret[i];
                switch(s){
                    case "+":
                        ss.push(String.valueOf(Integer.valueOf(ss.pop()) + Integer.valueOf(ss.pop())));
                        break;
                    case "-":
                        ss.push(String.valueOf(Integer.valueOf(ss.pop()) - Integer.valueOf(ss.pop())));
                        break;
                    case "*":
                        ss.push(String.valueOf(Integer.valueOf(ss.pop()) * Integer.valueOf(ss.pop())));
                        break;
                    case "/":
                        ss.push(String.valueOf(Integer.valueOf(ss.pop()) / Integer.valueOf(ss.pop())));
                        break;
                    default:
                        ss.push(s);
                        break;
                }
            }
            System.out.println(ss.pop());
        }
    }
}