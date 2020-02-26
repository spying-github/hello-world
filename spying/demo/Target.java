package com.spying.demo;

import java.awt.*;

/**
 * @author Spyda
 * @date 2020/2/8-17:04
 */
class Target {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        twoSum(nums,9);
    }
        public static int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j] == target-nums[i]){
                        System.out.println(i+","+j);
                        return new int[]{i,j};
                    }
                }
            }
            throw new IllegalArgumentException("不存在");
        }
}

