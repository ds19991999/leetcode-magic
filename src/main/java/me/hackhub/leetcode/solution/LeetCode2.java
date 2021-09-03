package me.hackhub.leetcode.solution;

import me.hackhub.leetcode.structure.ListNode;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 0:11
 * @Description: https://leetcode-cn.com/problems/add-two-numbers/
 */

public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode point = new ListNode();
        ListNode result;
        result = point;

        addNums(l1, l2, carry, point);
        if (result.next == null) {
            return result;
        }
        return result.next;
    }

    private void addNums(ListNode l1, ListNode l2, int carry, ListNode point) {
        // 结束条件
        if (l1 == null && l2 == null) {
            if (carry > 0) {
                point.next = new ListNode(carry);
            }
            return;
        }

        // 计算当前值
        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }
        carry = sum / 10;
        int currentVal = sum % 10;
        point.next = new ListNode(currentVal);

        // 递归
        addNums(l1, l2, carry, point.next);
    }
}
