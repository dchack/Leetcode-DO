package two_sum;

import base.SolutionUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-3,-4,-5,6};
        int target = 2;
        int[] result = new Solution2().twoSum(nums, target);
        SolutionUtil.printArray(result);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            List<Integer> value = map.get(nums[i]);
            if(value == null){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }else{
                value.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            result[0] = i;
            List<Integer> list = map.get(remain);
            if(list != null){
                for (Integer value : list){
                    if(value == i){
                        continue;
                    }else{
                        result[1] = value;
                        return result;
                    }
                }
            }
        }
        return result;
    }

}
