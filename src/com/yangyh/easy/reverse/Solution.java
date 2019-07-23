package com.yangyh.easy.reverse;

/**
 * [7] 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/description/
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * @author: yangyh
 * @create: 2019-03-11 14:56
 * √ Accepted
 *   √ 1032/1032 cases passed (14 ms)
 *   √ Your runtime beats 88.9 % of java submissions
 *   √ Your memory usage beats 72.04 % of java submissions (34.7 MB)
 **/
public class Solution {
    public int reverse(int x) {
        String reverseStr = "";
        String intStr = String.valueOf(x);
        int n = 1;
        for (int i = 0; i < intStr.length(); i++) {
            if (i == 0 && "-".equals(String.valueOf(intStr.charAt(i)))) {
                reverseStr = String.valueOf(intStr.charAt(i));
                n = 0;
                continue;
            }
            String str = String.valueOf(intStr.charAt(intStr.length() - i - n));
            reverseStr = reverseStr + str;
        }

        long l = Long.valueOf(reverseStr);

        //判断是否越界
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.valueOf(reverseStr);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-230));
    }
}
