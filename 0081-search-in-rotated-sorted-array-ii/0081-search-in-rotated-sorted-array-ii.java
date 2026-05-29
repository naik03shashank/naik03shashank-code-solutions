import java.util.Arrays;

class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);

        int start = 0;
        int last = nums.length - 1;

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return false;
    }
}