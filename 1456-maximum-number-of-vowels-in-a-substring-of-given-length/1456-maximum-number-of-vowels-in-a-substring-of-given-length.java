class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int max=0;
        int count=0;
        int r=k-1;
        int n=s.length();
        for(int i=l;i<=r;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            max=count;
        }
        while(r<n-1){
            if(isVowel(s.charAt(l)))
                count--;
            l++;
            r++;
            if(isVowel(s.charAt(r)))
                count++;
        max=Math.max(count,max);
        }
        return max;
        }
        private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';  
        
    }
}
