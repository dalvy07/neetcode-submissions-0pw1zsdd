class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenNum = new HashSet();

        for (var num : nums) {
            if (!seenNum.add(num)) {
                return true;
            }
        }

        return false;
    }
}