
上图是一个电话的九宫格，如你所见一个数字对应一些字母，因此在国外企业喜欢把
电话号码设计成与自己公司名字相对应。例如公司的Help Desk号码是4357，因为
4对应H、3对应E、5对应L、7对应P，因此4357就是HELP。同理，TUT-GLOP就
代表888-4567、310-GINO代表310-4466。
NowCoder刚进入外企，并不习惯这样的命名方式，现在给你—串电话号码列表
，请你帮他转换成数字形式的号码，并去除重复的部分。



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Crtated with IntelliJ IDEA.
 * Destcription:
 * User: hp
 * Date: 2021-06-08
 * Time: 23:34
 */
public class qq {
    public static void main(String[] args) {
        //先建立对应的映射关系
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<String> arrayList = new ArrayList<String>();//存放电话号码结果集
            for (int i = 0; i < n; i++) {
                String str = scanner.next();
                //将所有的杠去掉
                str = str.replace("-", "");
                //String result="";
                StringBuffer result = new StringBuffer();
                for (int j = 0; j < 7; j++) {
                    //result+=number.charAt(symbol.indexOf(str.charAt(j)+""));
                    //如果已经有三个号码了则需要加一个杠“-”
                    if (j == 3) {
                        result.append("-");
                    }
                    result.append(number.charAt(symbol.indexOf(str.charAt(j) + "")));
                }
//                    result=result.substring(0,3)+"-"+result.substring(3,7);
//                    if(!arrayList.contains(result))
//                        arrayList.add(result);
                //若结果集中没有这个号码，则放进结果集
                if (!arrayList.contains(result.toString()))
                    arrayList.add(result.toString());
            }
            //排序输出
            Collections.sort(arrayList);
            for (int j = 0; j < arrayList.size(); j++) {
                System.out.println(arrayList.get(j));
            }
            System.out.println();
        }
    }
}
