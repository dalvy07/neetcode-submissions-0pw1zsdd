class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int fixed = 0; fixed < nums.length - 2; fixed++) {
            int left = fixed + 1;
            int right = nums.length - 1;
            int localTarget = -nums[fixed];

            if (nums[0] > 0) break;
            if ((fixed > 0) && (nums[fixed] == nums[fixed - 1])) continue;

            while (left < right) {
                if ((nums[left] + nums[right]) > localTarget) {
                    right--;
                } 
                else if ((nums[left] + nums[right]) < localTarget) {
                    left++;
                }
                else {
                    result.add(Arrays.asList(nums[fixed], nums[left], nums[right]));
                    
                    // Skip all duplicates
                    while ((left < right) && (nums[left] == nums[left + 1])) { left++; } 
                    while ((left < right) && (nums[right] == nums[right - 1])) { right--; }
                    left++;
                    right--;
                }
            }
        }

        return result;
    }
}
