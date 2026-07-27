class Solution {
    static boolean hasDuplicate(int val, int[] nums) {
        int counter = 0;
        boolean ans = false;
        for(int i = 0; i < nums.length; i++) {
            if(val == nums[i]) {
                if(counter >= 1) {
                    return true;
                }
                counter++;
            }
        }
        return ans;
    }
    public boolean hasDuplicate(int[] nums) {
        boolean soln = false;
        for(int i=0; i < nums.length; i++) {
            if(hasDuplicate(nums[i], nums)) {
                return true;
            }
        }
        return soln;
    }
}