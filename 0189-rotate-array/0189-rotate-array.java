class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int  result[]=new int[n];
        int j=0;
        int i=0;
        k= k% n;
    for (i=n-k-1; i>=0;i--){
        result[j]=nums[i];
        j++;
    }
    for(i=nums.length-1;i>=n-k;i--){
        result[j]=nums[i];
         j++;
    }
    int p=0;
    for(i=n-1; i>=0;i--){
        nums[p]=result[i];
        p++;
    }
        
    }
}