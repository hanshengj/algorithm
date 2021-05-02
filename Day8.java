import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;
/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-19
 * Time: 18:24
 */
public class Day8 {
    /*
删除数组中的数，只留下一个数，输出这个数的原始下标


方法二：
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n > 1000 ){
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n ; i++){
                list.add(i);
            }

            int i = 0;
            while(list.size()>1){
                i = (i + 2) % list.size();//每删除一个元素时，该位置后的元素都往前移动了一个位置
                list.remove(i);
            }
            System.out.println(list.get(0));//每个数与自己对应的原始下标是一致的
        }

    }
}

找出n个数里最小的k个，每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
不超过100

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String[] strs = str.split(" ");
            int len = strs.length;
            int[] arr = new int[len-1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int k = Integer.valueOf(strs[len-1]);
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                if( i == k -1){
                    System.out.print(arr[i]);
                }else{
                System.out.print(arr[i]+" ");
                }
            }

        }

    }
}
     */


}
