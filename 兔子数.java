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
