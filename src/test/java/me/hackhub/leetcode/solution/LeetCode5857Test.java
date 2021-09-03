package me.hackhub.leetcode.solution;

import org.junit.Assert;
import org.junit.Test;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 17:43
 * @Description: https://leetcode-cn.com/problems/number-of-unique-good-subsequences/
 */

public class LeetCode5857Test {

    private final LeetCode5857 solution = new LeetCode5857();

    @Test
    public void test1() {
        String binary = "001";
        Assert.assertEquals(2, solution.numberOfUniqueGoodSubsequences(binary));
    }

    @Test
    public void test2() {
        String binary = "11";
        Assert.assertEquals(2, solution.numberOfUniqueGoodSubsequences(binary));
    }

    @Test
    public void test3() {
        String binary = "101";
        Assert.assertEquals(5, solution.numberOfUniqueGoodSubsequences(binary));
    }
}