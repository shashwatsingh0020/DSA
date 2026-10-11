class Solution {
    public String removeStars(String s) {
       Stack<Character> star= new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='*'){
            star.push(s.charAt(i));
        }
        else{
            star.pop();
        }
       }
       StringBuilder result=new StringBuilder();
       for (char num:star){
        result.append(num);
       }
    return result.toString();
        
    }
}