class Solution {
    public int longestOnes(int[] nums, int k) {
       int max=0;
       int j=0;
       int i=0;
       for(i=0;i<nums.length;i++ ){
        if(nums[i]==0){
            k--;
        }
       
       while(k<0){
        if(nums[j]==0){
        k++;
       }
       j++;
       }
        max=Math.max(max,i-j+1);
       }
       return max;
    }
}