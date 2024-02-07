class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (indicesNums.containsKey(value)) {
                return new int[]{indicesNums.get(value), i};
            }
            indicesNums.put(nums[i], i);
        }            
         return null;
    }
}
