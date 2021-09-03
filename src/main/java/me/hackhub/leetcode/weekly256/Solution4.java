package me.hackhub.leetcode.weekly256;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2017~2021 by hackhub.me
 *
 * @Author: mesondzh
 * @Date: 2021-08-29 10:35
 * @Description:
 */

public class Solution4 {

    private static final char ZERO = '0';

    public int numberOfUniqueGoodSubsequencesErrorSolution(String binary) {
        char[] chrList = binary.toCharArray();
        List<List<Character>> res = new ArrayList<>();
        backtrack(0, chrList, new ArrayList<>(), res);
        return res.size();
    }

    private void backtrack(int start, char[] chrList, ArrayList<Character> track, List<List<Character>> res) {
        // 排除不合法的选择
        ArrayList<Character> tmp = new ArrayList<>(track);
        if (tmp.size() != 0 && !res.contains(tmp)) {
            res.add(tmp);
        }
        if (track.size() == 1 && track.get(0) == ZERO) {
            return;
        }
        for (int j = start; j < chrList.length; j++) {
            track.add(chrList[j]);
            backtrack(j + 1, chrList, track, res);
            track.remove(track.size() - 1);
        }
    }

    public int numberOfUniqueGoodSubsequences(String binary) {
        int n = binary.length();
        int dp0 = 0, dp1 = 0, has0 = 0;
        int mod = (int) (1e9 + 7);
        for (int i = n - 1; i >= 0; --i) {
            if (binary.charAt(i) == '0') {
                has0 = 1;
                dp0 = (dp0 + dp1 + 1) % mod;
            } else {
                dp1 = (dp0 + dp1 + 1) % mod;
            }
        }
        return (dp1 + has0) % mod;
    }
}
