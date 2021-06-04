
nowcoder要和朋友交流一些敏感的信息，例如他的电话号码等。
因此他要对这些敏感信息进行混淆，比如在数字中间掺入一些额外的符号，
让它看起来像—堆乱码.
现在请你帮忙开发—款程序，解析从nowcoder那儿接收到的信息，
读取出中间有用的信息。



// write your code here


import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String number=scanner.nextLine();
            StringBuffer result=new StringBuffer();
            for(int i=0;i<number.length();i++){
                if(number.charAt(i)>='0'&&number.charAt(i)<='9'){
                    result.append(number.charAt(i));
                }
            }
            System.out.println(result);
        }
    }
}
