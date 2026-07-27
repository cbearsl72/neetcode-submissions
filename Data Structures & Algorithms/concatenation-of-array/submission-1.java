class Solution {
   public int[] getConcatenation(int[] nums) {
        int[] soln = new int[nums.length * 2];
        System.arraycopy(nums, 0, soln, 0, nums.length);
        System.arraycopy(nums, 0, soln, nums.length, nums.length);
        return soln;
    }

}