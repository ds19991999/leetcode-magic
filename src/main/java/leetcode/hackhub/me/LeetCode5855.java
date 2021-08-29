package leetcode.hackhub.me;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 17:39
 * @Description: https://leetcode-cn.com/problems/find-the-kth-largest-integer-in-the-array/
 */

public class LeetCode5855 {
    public String errorSolution(String[] nums, int k) {
        Arrays.sort(nums, Comparator.comparingInt(o -> Integer.parseInt(o, 10)));
        if (nums.length - k <= 0) {
            return nums[0];
        }
        return nums[nums.length - k];
    }

    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return 1;
            }
            if (o1.length() < o2.length()) {
                return -1;
            }
            return o1.compareTo(o2);
        });
        if (nums.length - k <= 0) {
            return nums[0];
        }
        return nums[nums.length - k];
    }
}
