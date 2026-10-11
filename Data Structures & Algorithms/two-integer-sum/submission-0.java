class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapCollect = new HashMap<Integer, Integer>();

        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];

            if(mapCollect.containsKey(diff)){
                int prevIndex = mapCollect.get(diff);
                return new int[]{prevIndex, i};
            }

            mapCollect.put(nums[i], i);
        }

        return new int[]{};
    }
}
