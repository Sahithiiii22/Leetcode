class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();

        
        for(int i=0;i<n;i++){
            int temp = nums[i];
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        for(int i =0; i<n;i++){
            int temp = nums[i];
            if(hm.get(temp) >=2){
                return true;
            }
        }
        return false;

    }
}