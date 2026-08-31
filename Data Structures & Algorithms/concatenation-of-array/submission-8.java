class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] soln = new int[2*n];

        System.arraycopy(nums,0,soln,0,n);
        System.arraycopy(nums,0,soln,n,n);
        return soln;
    }
}