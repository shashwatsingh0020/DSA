class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int n= s.length();
        int m= t.length();
        if(n==0){
            return true;
        }
        for(int j=0;j<m;j++){
            if(t.charAt(j)==s.charAt(i)){
                i++;
           if(i==n){
            return true;
           }
        }
        }
        return false;
    }
}