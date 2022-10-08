class Solution {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        char[] a = colors.toCharArray();
        int maximum=0;
        for(int i=1;i<a.length;++i)
        {
            if(a[maximum] == a[i])
            {
                result += Math.min(neededTime[maximum],neededTime[i]);
                if(neededTime[maximum] < neededTime[i])
                {
                    maximum = i;
                }
            }
             else maximum = i;
        }
        return result;
    }
}
