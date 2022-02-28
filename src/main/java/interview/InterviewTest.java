package interview;

import base.SolutionUtil;

/**
 * 20220228
 * 一个boss找工作聊天的时候发过来的面试题
 * 数组倒序
 */
public class InterviewTest {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 2, 1, 3, 5, 19, 32, 4};
        SolutionUtil.printArray(new InterviewTest().reversal(nums, 0, nums.length - 1));
    }

    public int[] reversal(int[] array, int left, int right){
        if(left >= right){
            return array;
        }
        swap(array, left, right);
        reversal(array, ++ left, -- right);
        return array;
    }

    private void swap(int[] array, int left, int right){
        int value = array[left];
        array[left] = array[right];
        array[right] = value;
    }

}
