package com.yangyh.difficulty.easy.reverse;

/**
 * @lc app=leetcode.cn id=7 lang=java
 * <p>
 * [7] 整数反转
 * <p>
 * https://leetcode-cn.com/problems/reverse-integer/description/
 * <p>
 * algorithms
 * Easy (31.80%)
 * Total Accepted:    89.6K
 * Total Submissions: 281.7K
 * Testcase Example:  '123'
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * <p>
 * <p>
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * @author: yangyh
 * @create: 2019-03-11 14:56
 **/
public class Solution2 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x= x / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && rev%10 >7) ) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && rev%10 < 8)) {
                return 0;
            }
            rev = rev *10 +pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.reverse(2147483647));
    }
}
