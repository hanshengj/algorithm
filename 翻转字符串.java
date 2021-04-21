
将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I
import java.util.*;
public class Main{
    //先定义一个反转函数
    public static void reverse(char[] ch,int start,int end){
        while(start<end){
            char temp=ch[end];
            ch[end]=ch[start];
            ch[start]=temp;
            start++;
            end--;
        }
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    //把字符串转数组
    char []arr=s1.toCharArray();
    int len=arr.length;
    //第一遍调用反转函数，全部反转
    reverse(arr,0,len-1);//反转函数直接从最后一个元素开始反转，所要传入数组的最后一个下标
    
    //进行第二遍反转，单词间的反转
    int i=0,j=0;
    //i记录每个单词的开始位置，j一次往后遍历i，找到单词的结尾，即空格
    while(i<len){
        j=i;//j要每次从单词的第一个字符开始
        while(j<len && arr[j]!=' '){
            j++;
        }
        //退出循环有两种情况，1是j越界，2是单词结束
        if(j<len){
            //表示单词结束，反转单词，此时j指向空格
            reverse(arr,i,j-1);
            //反转完后开始找下一个单词，下个单词开始的位置为j+1
            i=j+1;
            
        }else{
            //j越界,最后一个单词了
            reverse(arr,i,j-1);
            i=j;//用于退出最外面的循环
            
        }
    }
    //退出循环表示反转完成，要将数组转字符串
    String ss=new String(arr);
    System.out.println(ss);
    
}
}