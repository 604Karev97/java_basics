class Solution {
    public String reverseWords(String s) {
     List<String> result = new ArrayList<String>();
        if(s.length()==0)
            return s;
        
        int st = 0;
        while(st<s.length() && s.charAt(st)==' ')
            st++;
        
        int i = st;
        while(i<s.length())
        {
            while(i<s.length() && s.charAt(i)!=' ')
                i++;
            String tmp = s.substring(st,i);
            result.add(0,tmp);
            st = i;
            while(st<s.length() && s.charAt(st)==' ')
                st++;
            i = st+1;
        }
        return String.join(" ",result);
    }
}