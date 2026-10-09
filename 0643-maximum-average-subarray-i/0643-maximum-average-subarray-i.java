class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int curr_sum=0;
      int max_sum=Integer.MIN_VALUE;
      int l=0;
      int n=nums.length;
      int r=k-1;
      for(int i=l;i<=r;i++){
         curr_sum=curr_sum+nums[i];
      }
         max_sum=curr_sum;
        while(r<n-1){
            curr_sum=curr_sum-nums[l];
            l++;
            r++;
            curr_sum=curr_sum+nums[r];
            max_sum=Math.max(curr_sum,max_sum );
        }
return (double)max_sum/k;
    }
}