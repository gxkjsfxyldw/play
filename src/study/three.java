package study;

import java.util.Arrays;
import java.util.HashMap;

public class three {
    public static void main(String[] args) {
        /* 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
           和为目标值 target  的那 两个 整数，并返回它们的数组下标。*/

        /*
            输入：nums = [2,7,11,15], target = 9
            输出：[0,1]
            解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
         */
        int[]nums = {2, 7, 11, 15};
        int target = 22;
        int[] result = result(nums, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] result(int[] nums,int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

}
