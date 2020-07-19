package com.matthem.interview.arrays;

import java.util.Arrays;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */
public class AddTwoFromList {
  // int[] nums = [10, 15, 3, 7], int k = 17
  // Sort array
  // [3, 7, 10, 15]
  // start from position 0; j start from last index of array
  // keep track of sum of two nums in sum int
  // if sum < k -> move i forward to next index
  // if sum > k move j down to preceding index
  // if sum == k return true
  // otherwise return false
  public static boolean canTwoNumsAddToKSorted(int[] nums, int k) {
    if (checkEdgeCases(nums, k)) return false;

    //O(n log n)
    Arrays.sort(nums);

    // O(p)
    for (int i = 0, j = nums.length - 1; i < j;) {
      int sum = nums[i] + nums[j];
      if (sum < k) i++;
      else if (sum > k) j--;
      else return true;
    }

    return false;
  }

  private static boolean checkEdgeCases(int[] nums, int k) {
    return nums == null || nums.length == 0 || k <= 0;
  }

  // int[] nums = [10, 15, 3, 7], int k = 17
  // start from position 0; j start from next index after i
  // keep track of sum of two nums in sum int
  // if sum < k -> move i forward to next index
  // if sum > k move j down to preceding index
  // if sum == k return true
  // otherwise return false
  public static boolean canTwoNumsAddToKUnSorted(int[] nums, int k) {
    if (checkEdgeCases(nums, k)) return false;

    // O(n)
    for (int i = 0, j = i + 1; i < nums.length - 1;) {
      int sum = nums[i] + nums[j];
      if(sum == k) return true;
      if(j == nums.length - 1) {
        ++i;
        j = i + 1;
      } else j++;
    }

    return false;
  }
}
