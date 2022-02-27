package two_sum;

import base.SolutionUtil;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = new Solution2().twoSum(nums, target);
        SolutionUtil.printArray(result);
    }

    /**
     * for 循环中i++ 改成了 ++i
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            Integer value = map.get(target - nums[i]);
            if(value != null){
                return new int[]{value, i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

}
