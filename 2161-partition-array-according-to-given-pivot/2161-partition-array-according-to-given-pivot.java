class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] ans = new int[nums.length];
        int k = 0;

        // smaller than pivot
        for(int num : nums){
            if(num < pivot){
                ans[k++] = num;
            }
        }

        // equal to pivot
        for(int num : nums){
            if(num == pivot){
                ans[k++] = num;
            }
        }

        // greater than pivot
        for(int num : nums){
            if(num > pivot){
                ans[k++] = num;
            }
        }

        return ans;
    }
}