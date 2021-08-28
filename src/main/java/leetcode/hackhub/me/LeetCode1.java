package leetcode.hackhub.me;

import java.util.HashMap;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-28 22:36
 * @Description: https://leetcode-cn.com/problems/two-sum/
 */

public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(0);
        int diff;
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(diff, i);
            }
        }
        return new int[0];
    }
}
