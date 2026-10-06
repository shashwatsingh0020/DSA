class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ProdL=1;
        int ProdR=1;
        int ans []= new int[n];
        for(int i=n-1; i>=0;i--){
            ans[i]=ProdR;
            ProdR=ans[i]*nums[i];
        }
        for(int i=0; i<n;i++){
            ans[i]= ProdL*ans[i];
            ProdL=ProdL*nums[i];
        }
        return ans;
    }
}