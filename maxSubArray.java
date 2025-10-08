class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int mxsm= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum +=nums[i];
            mxsm = Math.max(sum,mxsm);
            if(sum<0) sum =0;
            }
        
        return mxsm;
    }
}
