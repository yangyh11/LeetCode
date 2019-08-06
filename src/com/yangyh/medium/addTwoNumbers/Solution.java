package com.yangyh.medium.addTwoNumbers;


/**
 * @description: 两数相加
 * ttps://leetcode-cn.com/problems/add-two-numbers/description/
 * @author: yangyh
 * @create: 2019-08-02 15:11
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * √ Accepted
 *   √ 1563/1563 cases passed (11 ms)
 *   √ Your runtime beats 36.04 % of java submissions
 *   √ Your memory usage beats 81.5 % of java submissions (
 */
public class Solution {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);
//        ListNode l12 = new ListNode(4);
//        ListNode l13 = new ListNode(3);
//        l1.next = l12;
//        l12.next  = l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);
        ListNode l24 = new ListNode(9);
        ListNode l25 = new ListNode(9);
        ListNode l26 = new ListNode(9);
        ListNode l27 = new ListNode(9);
        ListNode l28 = new ListNode(9);
        ListNode l29 = new ListNode(9);
        ListNode l30 = new ListNode(9);
        l2.next = l22;
        l22.next = l23;
        l23.next = l24;
        l24.next = l25;
        l25.next = l26;
        l26.next = l27;
        l27.next = l28;
        l28.next = l29;
        l29.next = l30;

        addTwoNumbers(l1, l2);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null;
        ListNode now = result = null;
        ListNode next = null;
        int nowVal = 0;

        int dot = 0;
        int val1 = 0;
        int val2 = 0;
        do {
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            } else {
                val1 = 0;
            }

            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;

            } else {
                val2 = 0;
            }

            nowVal = (val1 + val2 + dot) % 10;
            if (val1 + val2 + dot >= 10) {
                dot = 1;
            } else {
                dot = 0;
            }

            if (result == null) {
                result = new ListNode(nowVal);
                now = result;
                continue;
            }
            next = new ListNode(nowVal);
            now.next = next;
            now = next;

        } while (l1 != null || l2 != null);

        if (dot > 0) {
            next = new ListNode(dot);
            now.next = next;
        }

        return result;
    }
}
