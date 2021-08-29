package leetcode.hackhub.me;

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

    private static final LeetCode3 leetCode3 = new LeetCode3();

    @Test
    public void test1() {
        Assert.assertEquals(3, leetCode3.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, leetCode3.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, leetCode3.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, leetCode3.lengthOfLongestSubstring(""));
    }
}
