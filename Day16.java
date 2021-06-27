import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-04-28
 * Time: 22:49
 */
public class Day16 {

    /*
    求给定的数的以及比给定的数小的数中，完数的个数


    import java.util.*;
     public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        int num = sc.nextInt();
        int count=0;
        for(int i=0; i  <= num ; i++){

            if(isComplete(i)){
                count++;
            }
            }
        System.out.println(count);
        }
    }



    //求完数
    public static boolean isComplete(int n){
        //0和1不是完数
        if(n==0 || n == 1){
            return false;
        }
        int sum = 0;
        for (int i =1 ;i < n ; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            return true;
        }else{
            return false;
        }
    }

}
     */

/*

扑克牌游戏大家应该都比较熟悉了，一副牌由54张组成，含3~A，2各4张，小王1张，大王1张。牌面从小到大用如下字符和字符串表示（其中，小写joker表示小王，大写JOKER表示大王）:)
3 4 5 6 7 8 9 10 J Q K A 2 joker JOKER
输入两手牌，两手牌之间用“-”连接，每手牌的每张牌以空格分隔，“-”两边没有空格，如：4 4 4 4-joker JOKER
请比较两手牌大小，输出较大的牌，如果不存在比较关系则输出ERROR

基本规则：
（1）输入每手牌可能是个子，对子，顺子（连续5张），三个，炸弹（四个）和对王中的一种，不存在其他情况，由输入保证两手牌都是合法的，顺子已经从小到大排列；
（2）除了炸弹和对王可以和所有牌比较之外，其他类型的牌只能跟相同类型的存在比较关系（如，对子跟对子比较，三个跟三个比较），不考虑拆牌情况（如：将对子拆分成个子）
（3）大小规则跟大家平时了解的常见规则相同，个子，对子，三个比较牌面大小；顺子比较最小牌大小；炸弹大于前面所有的牌，炸弹之间比较牌面大小；对王是最大的牌；
（4）输入的两手牌不会出现相等的情况。

答案提示：
（1）除了炸弹和对王之外，其他必须同类型比较。
（2）输入已经保证合法性，不用检查输入是否是合法的牌。
（3）输入的顺子已经经过从小到大排序，因此不用再排序了.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ss = sc.nextLine();
            String[] pp = ss.split("-");
            //pp[0]第一手牌，pp[1]第二手牌
            String[] p1 = pp[0].split(" ");
            String[] p2 = pp[1].split(" ");
            String p = "34567891JQKA2";//用来比较大小，对应的下标越大，说明这个牌的排面值越大

            //如果有王炸的话直接输出王炸
            if (pp[0].equals("joker JOKER") || pp[1].equals("joker JOKER")) {
                System.out.println("joker JOKER");

            } else if (p1.length == p2.length) {
                //两手牌数相同情况
                if (p.indexOf(p1[0].substring(0, 1)) > p.indexOf(p2[0].substring(0, 1))) {
                    //p.indexOf(p1[0].substring(0,1))取得是第一手牌的最小的牌对应的下标，类一个类似
                    System.out.println(pp[0]);
                } else {
                    System.out.println(pp[1]);
                }

            } else {
                //两手牌数不相等时，可能有炸弹
                if (p1.length == 4) {
                    //第一手牌为炸弹
                    System.out.println(pp[0]);
                } else if (p2.length == 4) {
                    //第二手牌为炸弹
                    System.out.println(pp[1]);
                } else {
                    System.out.println("ERROR");
                }
            }
        }
    }


}
