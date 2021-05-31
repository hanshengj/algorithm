

红与黑，你站在一个黑色方格上，每次只能走上下左右的黑方格，问一共能经过多少黑方格
// write your code here
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            char ret[][] = new char[m][n];
            int a =0,b=0;
            for(int i =0;i <m ;i++){
               
              String str = sc.next();
                for (int j =0; j < n; j++) {
                    ret[i][j] = str.charAt(j);
                    if (ret[i][j] == '@') {
                        a = i;
                        b = j;
                    }
                }
            }
            Result(ret,a,b);
            System.out.println(count);
            count=0;
        }
    }
    
public static int count=0;
public static void Result(char[][]arr,int x,int y)
{
    if(x<0||x>=arr.length||y<0||y>=arr[0].length||arr[x][y]=='#')//走不通
        return;
    count++;
    arr[x][y]='#';//走过之后也不能走了
    Result(arr,x-1,y);//上下左右
    Result(arr,x+1,y);
    Result(arr,x,y-1);
    Result(arr,x,y+1);
}
}