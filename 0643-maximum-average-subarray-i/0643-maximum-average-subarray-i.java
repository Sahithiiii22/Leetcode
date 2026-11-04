class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int temp = 0;
        int l=0;
        for(int r=0;r<n;r++){
            sum += nums[r];
            if(r-l+1 > k){
                sum -= nums[l];
                l++;
            }

            if(r-l+1==k){
                maxSum = Math.max(sum,maxSum);
            }
        }
        return (double) maxSum/k;
    }
}
           