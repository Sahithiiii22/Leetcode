class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int count_pos = 0;
        int count_neg = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                count_pos++;
            }
            else if(nums[i]<0){
                count_neg++;
            }
        }

        max = Math.max(count_pos,count_neg);
        
        return max;

        
    }
}