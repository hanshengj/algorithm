给定两个数组，编写一个函数来计算它们的交集。

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //  if (nums1.length > nums2.length) {
        //     return intersect(nums2, nums1);
        // }
        //先遍历数组1，统计每个元素的次数
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i]) + 1);
            }else{
                map.put(nums1[i],1);
            }
        }
        int i = 0 ;
        int [] ret = new int[nums2.length];
        //遍历数组2，如果该值在map中存在，则将该数添加到返回数组中，
        //并将map中对应的次数减一，减到0时直接删除
        for (int j = 0 ; j < nums2.length ; j++){
            int n = map.getOrDefault(nums2[j], 0);
            if(n > 0){
              ret[i++]  = nums2[j];
              n--;
              if(n > 0){
                  map.put(nums2[j],n);
              }else{
                  map.remove(nums2[j]);
              }
            }
        }
         return Arrays.copyOfRange(ret, 0, i);
    }
}