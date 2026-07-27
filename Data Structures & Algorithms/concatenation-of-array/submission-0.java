class Solution {
    static void copyArr(int start, int[] nums, int[] soln) {
        for(int i = 0; i < nums.length; i++) {
            soln[i+start] = nums[i];
        }
    }
    public int[] getConcatenation(int[] nums) {
        int[] soln = new int[(nums.length)*2];
        copyArr(0, nums, soln);
        copyArr(nums.length, nums, soln);
        return soln;
    }
}