
给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
假设给出的数组中只存在唯一解
例如：
给出的数组为 {20, 70, 110, 150},目标值为90
输出 index1=1, index2=2
import java.util.*;


public class Solution {
    /**
     * 
     * @param numbers int整型一维数组 
     * @param target int整型 
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
//         for (int i= 0 ; i <numbers.length -1; i++){
//             for( int j = i+1 ; j < numbers.length ; j++){
//                 if(numbers[i] + numbers[j] == target){
//                     return new int[]{i+1 ,j+1};
//                 }
//             }
//         }
//         // write code here
//         return new int[]{-1,-1};
        
        Map<Integer,Integer> map = new HashMap<>();
        int temp;
        for(int i = 0 ; i < numbers.length ; i++){
            temp = numbers[i];
            //判断这个数是否有匹配的数
            if(map.containsKey(target - temp)){
                return  new int[]{map.get(target - temp) +1 ,i +1};
            }
            //没有匹配的数的话，将这个数放到map中
            map.put(temp,i);
        }
        return new int[]{-1,-1};
    }
}