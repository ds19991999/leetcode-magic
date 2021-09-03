package me.hackhub.leetcode.weekly256;

import java.util.Arrays;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 10:34
 * @Description: https://leetcode-cn.com/problems/minimum-number-of-work-sessions-to-finish-the-tasks/submissions/
 */

public class Solution3 {

    private int res = Integer.MAX_VALUE;

    private int groupSize = 0;

    int[] group = new int[20];

    public int minSessions(int[] tasks, int sessionTime) {
        Arrays.sort(tasks);
        dfs(0, tasks, sessionTime);
        return res;
    }

    private void dfs(int start, int[] tasks, int sessionTime) {
        // 结束条件
        if (groupSize >= res) {
            return;
        }
        if (start == tasks.length) {
            res = Math.min(res, groupSize);
            return;
        }

        for (int i = 0; i < groupSize; ++i) {
            // 剪枝
            if (group[i] + tasks[start] <= sessionTime) {
                group[i] += tasks[start];
                dfs(start + 1, tasks, sessionTime);
                group[i] -= tasks[start];
            }
        }

        // 新开一个组
        group[groupSize] = tasks[start];
        groupSize += 1;

        dfs(start + 1, tasks, sessionTime);
        group[groupSize] = 0;
        groupSize -= 1;

    }
}
