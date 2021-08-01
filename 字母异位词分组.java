
给定一个字符串数组，将字母异位词组合在一起。可以按任意顺序返回结果列表。

字母异位词指字母相同，但排列不同的字符串。

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        int len = strs.length;
        for(int i = 0 ;i < len ; i++){
            List<String> list = new ArrayList<>();
            if("1".equals(strs[i])){
                continue;
            }
            list.add(strs[i]);
            
            for(int j = i +1 ; j < len ; j++){
              if("1".equals(strs[j])){
               continue;
            }
            if(issame(strs[j] ,strs[i])){
                list.add(strs[j]);
                strs[j] = "1";
            }
            }
            ret.add(list);
            strs[i] = "1";
        }
        return ret;

     
    }

    public boolean issame(String s1,String s2){
         if(s1.length() != s2.length()){
             return false;
         }
         int [] ret = new int[26];
         int len = s1.length();
         for(int i = 0 ; i < len ; i++){
             ret[s1.charAt(i) - 'a'] += 1;
             ret[s2.charAt(i) - 'a'] -= 1;
         }
         for(int n : ret){
             if(n != 0){
                 return false;
             }
         }
         return true;
     }
}