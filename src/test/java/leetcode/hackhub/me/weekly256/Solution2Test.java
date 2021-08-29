package leetcode.hackhub.me.weekly256;

import org.junit.Assert;
import org.junit.Test;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 12:02
 * @Description: https://leetcode-cn.com/problems/find-the-kth-largest-integer-in-the-array/
 */

public class Solution2Test {

    private final Solution2 solution = new Solution2();

    @Test
    public void test1() {
        String result = solution.kthLargestNumber(new String[]{"3", "6", "7", "10"}, 4);
        Assert.assertEquals("3", result);
    }

    @Test
    public void test2() {
        String result = solution.kthLargestNumber(new String[]{"2", "21", "12", "1"}, 3);
        Assert.assertEquals("2", result);
    }

    @Test
    public void test3() {
        String result = solution.kthLargestNumber(new String[]{"0", "0"}, 2);
        Assert.assertEquals("0", result);
    }

    @Test
    public void test4() {
        String result = solution.kthLargestNumber(new String[]{"623986800", "3", "887298", "695", "794", "6888794705", "269409", "59930972", "723091307", "726368", "8028385786", "378585"}, 11);
        Assert.assertEquals("695", result);
    }
}