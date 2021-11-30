
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] posiciones = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[j] + nums[i]) {
                    posiciones[0] = nums[j];
                    posiciones[1] = nums[i];
                }
            }

        }
        return posiciones;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arreglo = { 2, 7, 11, 15 };
        s.twoSum(arreglo, 9);
    }
}