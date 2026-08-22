class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean containDuplicate=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]){ 
                containDuplicate=true;
               }
            }
        }
        return containDuplicate;
    }
}