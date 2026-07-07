class Solution {
    public int lengthOfLongestSubstring(String s){
        
        HashMap<Character,Integer> freq = new HashMap<>();
        int l = 0;
        int maxL = Integer.MIN_VALUE;

        for(int r=0 ; r < s.length(); r++){

            char ch = s.charAt(r);

            if(freq.containsKey(ch)){

                l = Math.max ( l, freq.get(ch)+1);

            }

            freq.put(ch,r);

            maxL = Math.max(maxL , r-l +1);


        }

        if(maxL < 0){
            maxL = 0;
        }

        return maxL;



    }
        
}