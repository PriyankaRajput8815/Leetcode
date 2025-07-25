class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int num = target-nums[i];
            if(map.containsKey(num)){
                int[]arr={map.get(num),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
