package me.volart;

/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,4,2,2]
 * Output: 2
 * Example 2:
 * <p>
 * Input: [3,1,3,4,2]
 * Output: 3
 * Note:
 * <p>
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n2).
 * There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class App {

  public int findDuplicate(int[] nums) {
    int b = nums[0];
    int e = nums[nums[0]];
    while (b != e){
      b = nums[b];
      e = nums[nums[e]];
    }
    e = 0;
    while (b != e){
      b = nums[b];
      e = nums[e];
    }
    return b;
  }
}
