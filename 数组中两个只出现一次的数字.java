一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，
空间复杂度是O(1)。


class Solution {
    public int[] singleNumbers(int[] nums) {
        int x = 0 ,y =0 ,n = 0 ,m = 1;
        for(int num : nums){
            n ^= num;
        }
        //n为两个只出现一次的数的异或值

        //找到他们值不同那一位
        while((n & m) == 0){
            m <<= 1;
        }
        for (int num : nums){
            if((num & m) == 0){
                x ^= num;
            }else{
                y ^= num;
            }
        }
        return new int[]{x,y};

    }
}

