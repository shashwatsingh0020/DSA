class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first=Integer.MAX_VALUE;
       int Second=Integer.MAX_VALUE;
       int third =Integer.MAX_VALUE;
       for(int i=0; i<nums.length;i++){
        if(nums[i]<=first){
            first=nums[i];
        }
        else if(nums[i]<=Second){
            Second=nums[i];
        }
        else{
            return true;
        }
       }
        return false;
    }
}