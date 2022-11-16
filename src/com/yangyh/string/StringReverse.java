package com.yangyh.string;

/**
 * @author yangyh
 * @date 2022/11/16 22:55
 * @description StringReverse
 */
public class StringReverse {
    public static void main(String[] args) {
        System.out.println(stringReverse("abcdef", 3));
        System.out.println(wordReverse("I am a student."));
    }

    // 字符串旋转
    static String stringReverse(String str, int n) {
        int len = str.length();
        char[] res = new char[len];
        for (int i = 0; i < len; i++) {
            res[(i + n) % len] = str.charAt(i);
        }
        return new String(res);
    }

    // 单词反转
    static String wordReverse(String str) {
        String[] words = str.split(" ");
        int left = 0;
        int right = words.length - 1;
        StringBuilder sb = new StringBuilder();
        while (left < right) {
            String temp = words[left];
            if (left != 0) {
                temp += " ";
            }
            words[left] = words[right] + " ";
            words[right] = temp;
            left++;
            right--;
        }
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

}
