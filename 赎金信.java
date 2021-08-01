
给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。

(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)



class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          if(magazine.length() < ransomNote.length()){
              return false;
          }
        //   int [] ret = new int[26];
        //   for(int i = 0 ; i< magazine.length() ; i++){
        //       ret[magazine.charAt(i) - 'a'] += 1;
        //   }
        //   for (int  j = 0 ; j < ransomNote.length() ; j++){
        //       ret[ransomNote.charAt(j) - 'a'] -= 1;
        //       if(ret[ransomNote.charAt(j) - 'a'] < 0){
        //           return false;
        //       }
        //   }
        //   return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < magazine.length() ; i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for(int j = 0 ; j < ransomNote.length(); j++){
            char ch = ransomNote.charAt(j);
            if(! map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch) -1);
            if(map.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}