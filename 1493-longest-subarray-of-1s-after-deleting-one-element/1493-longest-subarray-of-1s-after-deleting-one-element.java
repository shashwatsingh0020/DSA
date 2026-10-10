class Solution {
    public int longestSubarray(int[] nums) {
        int k=1;
        int j=0, i=0;
        int max=0;
        for(i=0; i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }
        while(k<0){
            if(nums[j]==0){
                k++;
            }
            j++;
        }
            max=Math.max(max,i-j);
        }
       return max;
        
    }
}