// write your code here



NowCoder每天要给很多人发邮件。有一天他发现发错了邮件，把发给A的邮件发给了B
，把发给B的邮件发给了A。于是他就思考，要给n个人发邮件，在每个人仅收到1封邮件
的情况下，有多少种情况是所有人都收到了错误的邮件？
即没有人收到属于自己的邮件。
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long sum = count(n);
            System.out.println(sum);
        }
 
    }
 
    //计算所有人都收不到自己的邮件的情况情况：错排算法
    private static long count(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (n - 1) * (count(n - 1) + count(n - 2));
        }
    }
}