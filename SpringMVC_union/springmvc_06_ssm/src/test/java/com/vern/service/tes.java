package com.vern.service;

import java.util.*;

/**
 * @Author 滨
 * @Date 2022/9/19 18:26
 * @Description: TODO
 * @Version 1.0
 */
public class tes {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int first= 0 ; first < len - 2 ; first++){
            if(first > 0 && nums[first] == nums[first - 1]){
                continue;
            }

            int second = first + 1;
            int third = len - 1;
            while(third > second){
                int sum = nums[first] + nums[second] + nums[third];
                if(sum == 0){
                    result.add(Arrays.asList(nums[first] , nums[second] , nums[third]));
                    while(third > second && nums[second] == nums[second + 1]){
                        second++;
                    }
                    second++;
                    while(third > second && nums[third] == nums[third - 1]){
                        third--;
                    }
                    third--;
                }else if(sum > 0){
                    third--;
                }else {
                    second++;
                }
            }
        }
        return result;
    }

    public int threeSumClosest(int[] nums, int target){
        int len = nums.length;
        int result = nums[0]+nums[1]+nums[2];
        if(len == 3 || nums[0] >= target){
            return result;
        }
        Arrays.sort(nums);
        for(int p1 = 0 ; p1 < len - 2 ; p1++){
            int p2 = p1 + 1;
            int p3 = len - 1;
            while(p2 < p3){
                int temp = nums[p3]+nums[p1]+nums[p2];
                if(Math.abs(temp -target) < Math.abs(result - target)){
                    result = temp;
                }
                if(temp > target){
                    p2--;
                }else if(temp < target){
                    p1++;
                }else {
                    return temp;
                }
            }
        }
        return result;
    }

    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if(len < 4){
            return result;
        }
        Arrays.sort(nums);
        for(int p1 = 0 ; p1 < len - 3 ; p1 ++){
            if(p1 > 0 && nums[p1] == nums[p1 - 1]){
                continue;
            }
            if ((long) nums[p1] + nums[p1 + 1] + nums[p1 + 2] + nums[p1 + 3] > target) {
                break;
            }
            if ((long) nums[p1] + nums[len - 3] + nums[len - 2] + nums[len-1]<target)       {
                continue;
            }
            for(int p2 = p1 + 1 ; p2 < len -2 ; p2++){
                if(p2 > p1 + 1 && nums[p2] == nums[p2 - 1]){
                    continue;
                }
                int p3 = p2 + 1;
                int p4 = len - 1;
                while(p3 < p4){
                    int temp = nums[p1] + nums[p2] + nums[p3] + nums[p4];
                    if(temp == target){
                        result.add(Arrays.asList(nums[p1] , nums[p2] , nums[p3] , nums[p4]));
                        while(p3 < p4 && nums[p4] == nums[p4 - 1]){
                            p4--;
                        }p4--;
                        while(p3 < p4 && nums[p3] == nums[p3 + 1]){
                            p3++;
                        }p3++;
                    }else if(temp < target){
                        p3++;
                    }else {
                        p4--;
                    }
                }
            }
        }
        return result;
    }

    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len < 2){
            return 1;
        }
        int p = 0;
        int q = 1;
        while(q < len){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int left = 0;
        for(int right = 0 ; right < len ; right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}