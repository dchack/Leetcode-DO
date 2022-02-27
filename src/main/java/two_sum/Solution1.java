package two_sum;

import base.SolutionUtil;

public class Solution1{

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 3, 5};
        int target = 7;
        int[] result = new Solution1().twoSum(nums, target);
        SolutionUtil.printArray(result);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if(target == nums[i] + nums[j]){
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

}
