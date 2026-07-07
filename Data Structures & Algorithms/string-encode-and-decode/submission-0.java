class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            int n = s.length();
            sb.append(n);
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String s) {

        List<String> ans = new ArrayList<>();

        int i=0;

        while(i<s.length()){
            int j = i;

            while(s.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(s.substring(i, j));

            ans.add(s.substring(j+1, j+len+1));

            i = j + len + 1;
        }

        return ans;

    }
}