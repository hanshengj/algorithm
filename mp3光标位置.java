本题的意思是第一行输入歌曲数量，第二行输入指令，最后需要显式的输出也为两行，
第一行为当前歌曲所在的列表，第二行为光标所指向的歌曲。

import java.util.*;
import java.io.*;

public class aa {
    public static void mouseMove(String numStr, String orderStr) {
           //歌曲数量 
        int n = Integer.parseInt(numStr);
           //指令数组： UD 
        char[] order = orderStr.toCharArray();
            //当前鼠标所在的位置
        int mouse = 1;
        //显示列表所在的起始位置 
        int first = 1;
            //指令处理 //n <=4
        if (n <= 4) {
            //循环处理每一个指令 
            for (int i = 0; i < order.length; ++i) {
                   //光标在第一首歌曲上时，按Up键光标挪到最后一首歌曲 
                if (mouse == 1 && order[i] == 'U')
                    mouse = n;
                 //光标在最后一首歌曲时，按Down键光标挪到第一首歌曲 
                else if (mouse == n && order[i] == 'D')
                    mouse = 1;
                   //其他情况下用户按Up键，光标挪到上一首歌曲 
                else if (order[i] == 'U')
                    --mouse;
                //用户按Down键，光标挪到下一首歌曲 
                else if (order[i] == 'D')
                    ++mouse;
            }
             //输出 //打印当前的显示列表 
            for (int i = 1; i < n; ++i)
                System.out.print(i + " ");
            System.out.println(n);
              //打印当前歌曲 
            System.out.println(mouse);
        }

        //n > 4 

        else {
            for (int i = 0; i < order.length; ++i) {
                 //屏幕显示的是第一页（即显示第1 – 4首）时，光标在第一首歌曲上，
                //用户按Up键后，屏幕要显示最后一页（即显示第7-10首歌）， 
                //同时光标放到最后一首歌上。
                if (first == 1 && mouse == 1 && order[i] == 'U') {
                 //最右一页的起始位置 
                    first = n - 3;
                    mouse = n;
                }
           //同样的，屏幕显示最后一页时，光标在最后一首歌曲上， 
          //用户按Down键，屏幕要显示第一页，光标挪到第一首歌上。
                else if (first == n - 3 && mouse == n && order[i] == 'D') {
                    first = 1;
                    mouse = 1;
                }
             //屏幕显示的不是第一页时，光标在当前屏幕显示的第一首歌曲时，用户按Up键后，
                //屏幕从当前歌曲的上一首开始显示，光标也挪到上一首歌曲。
                else if (first != 1 && mouse == first && order[i] == 'U') {
                    --mouse;
                    --first;
                }
            //屏幕显示的不是第一页时,光标在当前屏幕的最后一首歌时的
                //按Down键，屏幕从当前歌曲的下一首开始显示，光标也挪到下一首歌曲
                else if (first != n - 3 && mouse == first + 3 && order[i] == 'D') {
                    first++;
                    mouse++;
                }
               //其它情况，只移动光标 
                else if (order[i] == 'U')
                    --mouse;
                else if (order[i] == 'D')
                    ++mouse;
            }
             //输出 //打印当前的显示列表 
            for (int i = first; i < first + 3; ++i)
                System.out.print(i + " ");
            System.out.println(first + 3);
             //打印当前歌曲 
            System.out.println(mouse);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numStr;
        while ((numStr = reader.readLine()) != null) {
            String orderStr = reader.readLine();
            mouseMove(numStr, orderStr);
        }
    }
}