package me.volart;

public class Solution {
  public int missingNumber(int[] nums) {
    int i = 0;
    int missed = nums[i] ^ i;
    i++;
    for (; i < nums.length; i++) {
      int n = nums[i];
      missed ^= n ^ i;
    }

    return missed;
  }
}