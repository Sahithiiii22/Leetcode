class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans = 0;
        
        int k= 0;
        int n = nums.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            ans = nums[i] * nums[i];
            result[k] = ans;
            k++;

        }
        Arrays.sort(result);
        
        
    return result;
}
}