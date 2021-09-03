package me.hackhub.leetcode.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 9:05
 * @Description: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        // 记录当前起始位置的最长字串
        Set<Character> currentStr = new HashSet<>();
        int lenS = s.length();
        int right = -1;
        int result = 0;
        for (int left = 0; left < lenS; left++) {
            if (left > 0) {
                currentStr.remove(s.charAt(left - 1));
            }
            while (right + 1 < lenS && !currentStr.contains(s.charAt(right + 1))) {
                currentStr.add(s.charAt(right + 1));
                right++;
            }
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
