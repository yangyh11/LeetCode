package com.yangyh.easy.isPalindrome;

/**
 * @description: 09-判断一个整数是否是回文数
 * @author: yangyh
 * @create: 2019-06-14 17:07
 * √ Accepted
 *   √ 11509/11509 cases passed (56 ms)
 *   √ Your runtime beats 52.26 % of java submissions
 *   √ Your memory usage beats 77.16 % of java submissions
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else if (x % 10 == 0) {
            return false;
        }

        String str = String.valueOf(x);

        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i = chars.length-1; i >=0; i--) {
            sb.append(chars[i]);
        }
        if (str.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}
