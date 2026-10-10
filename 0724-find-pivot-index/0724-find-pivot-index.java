class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        int total=0;
        int j=nums.length-1;
        int suml=0,sumr=0;
        for( i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        for(i=0;i<nums.length;i++){
            sumr=total-suml-nums[i];
            if(suml==sumr){
                return i;
            }
            suml=suml+nums[i];
        }
       return -1;
    }
}