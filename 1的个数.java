
输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。

例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。


class Solution {
    public int countDigitOne(int n) {
        int digit = 1, res = 0;
        //digit代表个位十位等，res代表结果，即1的个数
        int high = n / 10, cur = n % 10, low = 0;
        //cur代表当前位的数值，low代表当前位低的数值，high比当前位搞得位的数值
        while(high != 0 || cur != 0) {
            //当当前位为0，且它的高位也为0时，计算结束
            if(cur == 0) {
                //当前位为0
                res += high * digit;
            }else if(cur == 1) {
                //当前位为1
                res += high * digit + low + 1;
            }else {
                //当前位为2,3,4,5，6,7,8，9，的情况
                res += (high + 1) * digit;
            }
            //变更条件
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
}

