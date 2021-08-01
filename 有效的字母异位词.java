给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。




class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length()){
            return false;
        }
        //map法，s字符串遍历的时候给对应的map值加一，t减一，如果map中不包含t 对应的值或者值小于0，返回false
        // HashMap<Character,Integer> map = new HashMap<>();
        // for (int i = 0 ; i < s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch,map.get(ch)+1);
        //     }else{
        //         map.put(ch,1);
        //     }

        // }
        //  for (int i = 0 ; i < s.length(); i++){
        //      char ch = t.charAt(i);
        //      if(!map.containsKey(ch)){
        //          return false;
        //      }
        //      map.put(ch,map.get(ch)-1);
        //      if(map.get(ch)< 0){
        //          return false;
        //      }
        //  }
        //  return true;

        //下标映射法
        int len = s.length();
        int[] ret = new int[26];
        for(int i = 0 ; i < len ; i++){
            ret[s.charAt(i)- 'a'] += 1;
            ret[t.charAt(i)- 'a'] -= 1;

        }
        for(int n : ret){
            if(n != 0){
                return false;
            }
        }
        return true;

    }
}