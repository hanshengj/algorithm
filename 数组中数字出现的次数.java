
在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。
请找出那个只出现一次的数字。

 


class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int index = -1;//用来标记这个不一样的值出现了几次
        for(int i = 0 ; i < n -1; i++){
            //r如果前后值相等，则继续下次的循环
            if(nums[i] == nums[i+1]){
                continue;
            }else{
                //不相等时
                //如果这个值是排序后第一个数，则直接返回
                if(i ==0 || i == n - 1){
                    return nums[i];
                }else{
                    //不是第一个数的话，先判断这个数是第几次不一样了，
                    //第一次的话继续下次循环，第二次直接返回
                    if(index == i){
                        //左右两边都不一样，所以这个数就出现了一次
                        return nums[i];
                    }else{
                        index = i + 1;
                        continue ;
                    }
                    

                }
            }

        }
        //退出循环时，肯定就是最后的那个数了
        return nums[n-1];

    }
}