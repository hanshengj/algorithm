
给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。

你可以按任意顺序返回答案

class Solution {
    List<String> list = new ArrayList<>();
    public List<String> commonChars(String[] words) {
        int len = words.length;
        int [] ret = new int[26];
        int [] ret1 = new int[26];
        //将第一个字符串存入数组
        String a = words[0];
        for(int j = 0 ; j < a.length(); j++){
                ret[a.charAt(j) - 'a'] += 1;
            }
          //往后遍历字符串
        for(int i = 1 ; i < len ; i++){
            String temp = words[i];
                for(int jj = 0 ; jj < temp.length(); jj++){
                ret1[temp.charAt(jj) - 'a'] += 1;
            }
            //得到公共部分
             for(int ii = 0 ;  ii < 26 ;ii++){
                 ret[ii] = Math.min(ret[ii],ret1[ii]);
                 ret1[ii] = 0 ;
             }
        }
        //输出公共部分
        for(int i = 0 ;  i < 26 ;i++){
            for(int j = 0 ; j < ret[i] ; j++){
                list.add((char)(i + 'a') + "");
            }
        }
        return list;
    }
}