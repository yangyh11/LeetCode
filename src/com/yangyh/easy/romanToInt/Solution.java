package com.yangyh.easy.romanToInt;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 13-罗马数字转整数
 * @author: yangyh
 * @create: 2019-07-23 11:30
 * https://leetcode-cn.com/problems/roman-to-integer/description/
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * √ Accepted
 *   √ 3999/3999 cases passed (31 ms)
 *   √ Your runtime beats 41.19 % of java submissions
 *   √ Your memory usage beats 71.27 % of java submissions (41.1 MB)
 */
public class Solution {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(7);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        int number = map.get(chars[chars.length - 1]);
        for (int i = chars.length - 2; i >= 0; i--) {
            char key = chars[i];
            if (map.get(key) < map.get(chars[i + 1])) {
                number = number - map.get(key);
            } else {
                number = number + map.get(key);
            }
        }
        return number;
    }
}
