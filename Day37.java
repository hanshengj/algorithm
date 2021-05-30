

创建级联目录

// write your code here
import java.util.*;
public class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < arr.length; i ++ ) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr);
            List<String> res = new ArrayList<>();
            for (int i = 1; i < arr.length; i ++ ) {
                //不是以前一个目录开头的需要输出
                if( ! arr[i].startsWith(arr[i - 1] + "/")) res.add(arr[i - 1]);
            }
            res.add(arr[n - 1]);//添加最后一个目录
            for (String s:res) {
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
    }
}

数据库连接池
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
           int n = sc.nextInt();
            int max = 0,len = 0;
            for(int i = 0;i < n;i++){
                String id = sc.next();
                String state = sc.next();
                //connect表示连接+1，disconnect释放连接-1
                if("connect".equals(state)){
                    len++;
                    max=Math.max(max,len);
                }else{
                    len--;
                }
            }
            System.out.println(max);
    }
}
}