package leetcode.hackhub.me;

import java.util.Arrays;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 17:39
 * @Description: https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */

public class LeetCode5854 {
    public int minimumDifference(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        Arrays.sort(nums);
        int len = nums.length;
        if (k >= len) {
            return nums[len - 1] - nums[0];
        }

        int min = nums[0], max = nums[k - 1];
        int result = max - min;
        for (int pos = 1; pos + k - 1 < len; pos++) {
            result = Math.min(result, nums[pos + k - 1] - nums[pos]);
        }
        return result;
    }
}
