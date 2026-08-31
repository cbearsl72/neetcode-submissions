class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] soln = new int[2*len];
        for(int i=0; i < len; i++) {
            soln[i] = nums[i];
            soln[i+len] = nums[i];
        }
        return soln;
    }
}