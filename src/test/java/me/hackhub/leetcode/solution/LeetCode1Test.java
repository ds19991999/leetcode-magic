package me.hackhub.leetcode.solution;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-28 22:36
 * @Description: https://leetcode-cn.com/problems/two-sum/
 */

public class LeetCode1Test {

    private final LeetCode1 solution = new LeetCode1();

    @Test
    public void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] exampleResult = {0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(exampleResult, result);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] exampleResult = new int[]{1, 2};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(exampleResult, result);
    }

    @Test
    public void test3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] exampleResult = new int[]{0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(exampleResult, result);
    }
}
