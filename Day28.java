import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-05-19
 * Time: 19:34
 */
public class Day28 {

    //链接：https://www.nowcoder.com/questionTerminal/480d2b484e1f43af8ea8434770811b4a
    //来源：牛客网

    /**
     * 思路：因为每次分5堆都会多出来1个，所以我们借给猴子们4个，以致每次都可以刚好分成5堆
     *     并且，每次给老猴子的桃子都不在我们借出的那4个中，这样最后减掉4就可以得到结果。
     *   假设最初由x个桃子，我们借给猴子4个，则此时有x+4个，
     *   第一个猴子得到（x+4）/5，剩余（x+4）*（4/5）个
     *   第二个猴子分完后剩余（x+4）*(4/5)^2个
     *   第三个猴子分完后剩余（x+4）*(4/5)^3个
     *   依次类推，最后一个猴子分完后剩余（x+4）*（4/5）^n
     *   要满足最后剩余的为整数，并且x最小，则当 x+4=5^n时，满足要求
     *   此时，x=5^n-4;
     *   老猴子得到的数量为：old = （x+4）*（4/5）^n + n - 4
     *                     = 4^n + n - 4
     *   最后加n是因为不是剩余多出来的一个，而是小猴子给的，比如桃子是有6个，小猴子本身只能拿一个，我们借给4个，小猴就能拿两个，那多出来的哪一个给老猴子，和之前6个整除五余1一个道理
     *   最后老猴子减4是还给我们借给它们的那4个
     *
     */
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                if(n==0){
                    break;
                }
                long a = (long)Math.pow(5,n);
                Long b = (long)Math.pow(4,n);
                System.out.println((a-4) + " " +(b+n-4));
            }
        }

        /*

        public class Solution {
	/**
	 *	奇数位上都是奇数或者偶数位上都是偶数
	 *	输入：数组arr，长度大于2
	 *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数

        public void oddInOddEvenInEven(int[] arr) {
            int len = arr.length;
            int i = 0,j=1;//i代表偶数位，j代表奇数位
            int temp=0;
            while (i<len && j<len){
                if(arr[len-1]% 2==0){
                    //如果是偶数换到偶数位
                    temp = arr[len-1];
                    arr[len-1] = arr[i];
                    arr[i] = temp;
                    i+=2;
                }else {
                    //奇数换到奇数位
                    temp = arr[len-1];
                    arr[len-1] = arr[j];
                    arr[j] = temp;
                    j+=2;
                }
            }

        }
    }
         */

}
