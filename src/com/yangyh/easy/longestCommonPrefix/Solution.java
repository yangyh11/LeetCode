package com.yangyh.easy.longestCommonPrefix;


/**
 * @description: 最长公共前缀
 * @author: yangyh
 * @create: 2019-07-23 15:57
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Solution {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        for (String str : strs) {
            if ("".equals(str) || null == str) {
                return "";
            }
        }

        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            char[] array = commonPrefix.toCharArray();
            char[] temp = strs[i].toCharArray();
            String str = "";

            for (int j = 0; j < temp.length; j++) {
                if (array.length - 1 < j || array[j] != temp[j]) {
                    break;
                } else {
                    str += temp[j];
                }
            }
            if ("".equals(str)) {
                return str;
            }
            commonPrefix = str;
        }
        return commonPrefix;
    }
}
