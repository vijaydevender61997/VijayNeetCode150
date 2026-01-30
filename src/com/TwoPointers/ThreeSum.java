package com.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));

	}

	private static List<List<Integer>> threeSum(int[] nums) {

		if (nums.length == 0) {
			return new ArrayList<>();
		}

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length && nums[i] <= 0; i++) {

			if (i == 0 || nums[i] != nums[i - 1]) {

				twoSum(ans, i, nums);

			}

		}

		return ans;
	}

	private static void twoSum(List<List<Integer>> ans, int i, int[] nums) {

		int j = i + 1, k = nums.length - 1;
		while (j < k) {

			int sum = nums[i] + nums[j] + nums[k];

			if (sum > 0) {
				k--;

			} else if (sum < 0) {
				j++;
			} else {

				ans.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				while (j < k && nums[j] == nums[j - 1]) {
					++j;
				}

			}

		}

	}

}
