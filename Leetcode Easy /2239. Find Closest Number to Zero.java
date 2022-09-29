class Solution {
    public int findClosestNumber(int[] nums) {
		int result = Integer.MAX_VALUE;
        for(int i : nums){
            if(Math.abs(i) <= Math.abs(result) && Math.abs(i) != result){
                result = i;    
            }
        }
        return result;
    }
} 