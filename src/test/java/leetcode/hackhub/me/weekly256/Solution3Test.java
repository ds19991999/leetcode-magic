package leetcode.hackhub.me.weekly256;

import org.junit.Assert;
import org.junit.Test;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 12:44
 * @Description: https://leetcode-cn.com/problems/minimum-number-of-work-sessions-to-finish-the-tasks/submissions/
 */

public class Solution3Test {

    private final Solution3 solution = new Solution3();

    @Test
    public void test1() {
        int[] task = {3, 1, 3, 1, 1};
        int sessionTime = 8;
        Assert.assertEquals(2, solution.minSessions(task, sessionTime));
    }

    @Test
    public void test2() {
        int[] task = {1, 2, 3};
        int sessionTime = 3;
        Assert.assertEquals(2, solution.minSessions(task, sessionTime));
    }

    @Test
    public void test3() {
        int[] task = {1, 2, 3, 4, 5};
        int sessionTime = 15;
        Assert.assertEquals(1, solution.minSessions(task, sessionTime));
    }

    @Test
    public void test4() {
        int[] task = {1, 7};
        int sessionTime = 7;
        Assert.assertEquals(2, solution.minSessions(task, sessionTime));
    }
}