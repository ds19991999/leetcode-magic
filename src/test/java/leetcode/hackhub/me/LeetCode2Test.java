package leetcode.hackhub.me;

import org.junit.Assert;
import org.junit.Test;
import structure.leetcode.hackhub.me.ListNode;

import java.util.ArrayList;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 0:13
 * @Description: https://leetcode-cn.com/problems/add-two-numbers/
 */

public class LeetCode2Test {

    private final LeetCode2 solution = new LeetCode2();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ArrayList<Integer> result1 = getListFromListNode(new ListNode(7, new ListNode(0, new ListNode(8))));

        ArrayList<Integer> result2 = getListFromListNode(solution.addTwoNumbers(l1, l2));
        Assert.assertArrayEquals(new ArrayList[]{result1}, new ArrayList[]{result2});
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = new ListNode(0);

        ArrayList<Integer> result1 = getListFromListNode(result);
        ArrayList<Integer> result2 = getListFromListNode(solution.addTwoNumbers(l1, l2));
        Assert.assertArrayEquals(new ArrayList[]{result1}, new ArrayList[]{result2});
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9,
                        new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = new ListNode(8, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(0, new ListNode(0,
                        new ListNode(0, new ListNode(1))))))));

        ArrayList<Integer> result1 = getListFromListNode(result);
        ArrayList<Integer> result2 = getListFromListNode(solution.addTwoNumbers(l1, l2));
        Assert.assertArrayEquals(new ArrayList[]{result1}, new ArrayList[]{result2});
    }

    private ArrayList<Integer> getListFromListNode(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        while (listNode != null) {
            result.add(listNode.val);
            listNode = listNode.next;
        }
        return result;
    }
}
