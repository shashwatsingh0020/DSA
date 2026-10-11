class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
           set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
           set2.add(nums2[i]);
        }
        ArrayList<Integer>diff1=new ArrayList<>();
        ArrayList<Integer>diff2=new ArrayList<>();
         for(int num:set1){
            if(!set2.contains(num)){
                diff1.add(num);
            }
         }
            for(int num:set2){
            if(!set1.contains(num)){
                diff2.add(num);
            }
         }
         List<List<Integer>> answer=new ArrayList<>();
         answer.add(diff1);
         answer.add(diff2);
         return answer;

    }
}