package me.volart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * <p>
 * Each number in candidates may only be used once in the combination.
 * <p>
 * Note:
 * <p>
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 * Example 1:
 * <p>
 * Input: candidates = [10,1,2,7,6,1,5], target = 8,
 * A solution set is:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * Example 2:
 * <p>
 * Input: candidates = [2,5,2,1,2], target = 5,
 * A solution set is:
 * [
 * [1,2,2],
 * [5]
 * ]
 */
public class App {
  public static void main(String[] args) {

  }

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ans = new ArrayList<>();
    combination(ans, new ArrayList<Integer>(), candidates, 0, target);
    return ans;
  }

  private void combination(List<List<Integer>> ans, List<Integer> comb, int[] c, int s, int n) {
    if (n < 0) return;
    if (n == 0) {
      ans.add(new ArrayList<>(comb));
      return;
    }
    for (int i = s; i < c.length; i++) {
      if (i > s && c[i] == c[i - 1]) continue;
      int cand = c[i];
      comb.add(cand);
      combination(ans, comb, c, i + 1, n - cand);
      comb.remove(comb.size() - 1);
    }
  }
}
