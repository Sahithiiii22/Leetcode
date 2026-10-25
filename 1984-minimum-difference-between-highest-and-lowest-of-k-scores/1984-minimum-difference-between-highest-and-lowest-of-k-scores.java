class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n = nums.length;
        int l= 0;
        for(int r=0;r<n;r++){
            if(r-l==k){
                l++;
            }
            if(r-l+1==k){
                int temp = nums[r] - nums[l];
                ans = Math.min(ans,temp);
            }
        }
        return ans;
        
    }
}