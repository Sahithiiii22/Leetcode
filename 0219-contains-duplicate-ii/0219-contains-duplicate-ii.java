class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        
        int l =0;
        HashSet <Integer> set = new HashSet<>();
    
        for(int r=0;r<n;r++){
            if(r-l>k){
                set.remove(nums[l]);
                l++;
            }
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
        }
        return false;
        

        
    }
}

    
