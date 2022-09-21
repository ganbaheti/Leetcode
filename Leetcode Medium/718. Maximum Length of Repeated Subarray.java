class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        
        int dp[][] = new int[a+1][b+1];
        
        int maximum=0;
        for(int i=1;i<=a;i++)
            for(int j=1;j<=b;j++)
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                    maximum = Math.max(maximum,dp[i][j]);
                }
        
        return maximum;
    }
}