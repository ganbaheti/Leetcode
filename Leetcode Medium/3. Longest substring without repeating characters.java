class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int m=0;
        HashSet<Character> hash_set = new HashSet();
        while(j< s.length())
        {
            if(!hash_set.contains(s.charAt(j)))
            {
                hash_set.add(s.charAt(j));
                j++;
                m= Math.max(hash_set.size(),m);
            }
            else
            {
                hash_set.remove(s.charAt(i));
                i++;
            }
        }
        return m;
    }
}