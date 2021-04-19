删除数组中的数，只留下一个数，输出这个数的原始下标

    import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>1000){
           n=999;
        }
        if(n<=0){
            return;
                     }
        if(n==1){
         System.out.println(0);
            return;
        }
        int []ret=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            ret[i]=i;
            sum+=i;
        }

        int index=0;//数组的下标
        int num=n;//统计数组中还有多少个数字
        while(num>1 ){
       if((index+2)<n && ret[index+2]!=-1){//表示这个数还没有删除
           num--;
           sum-=ret[index+2];//总和中减去这个数
           ret[index+2]=-1;//-1表示已经删除

           index+=3;//指向删除元素的下一个位置
           index%=n;//要进行循环读取，所以采用取余法
       }
        }
        //退出循环，则表示只有一个数了
        //总总和的值就是这个数的下标

           System.out.println(sum);

    }
}

方法二：
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();//删除后，所有删除位置以后的位置都向前移动了1
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}

     */
