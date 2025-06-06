class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}