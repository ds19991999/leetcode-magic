package me.hackhub.leetcode.solution;

import org.junit.Assert;
import org.junit.Test;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 9:06
 * @Description:
 */

public class LeetCode3Test {

    private final LeetCode3 solution = new LeetCode3();

    @Test
    public void test1() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}
