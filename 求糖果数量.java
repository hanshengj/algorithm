求abc三人的糖果数量
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int add=a+b+c+d;
        int sub=a-b-c-d;
        //不能为负数
        if(add>120 || sub<-120 || a>c || b> d || c<0 ||d<0){
           System.out.println("No") ;
            return;
        }
        int A,B,C;
        //糖果不能为半个
        if((a+c)%2!=0 || (b+d)%2!=0 ||(d-b)%2!=0 || (d-b)<0){
           System.out.println("No") ;
            return;
        }
            
        A=(a+c)>>1;
        B=(b+d)>>1;
        C=(d-b)>>1;
        System.out.println(A+" " + B +" "+ C +" " );
    }
}