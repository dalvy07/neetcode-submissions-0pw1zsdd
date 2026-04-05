class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numsCount = new HashMap();

        for (var num : nums) {
            if (numsCount.containsKey(num)) {
                numsCount.put(num, numsCount.get(num) + 1);
            }
            else {
                numsCount.put(num, 1);
            }
        }

        for (var value : numsCount.values()) {
            if (value > 1) {
                return true;
            }
        }

        return false;
    }
}