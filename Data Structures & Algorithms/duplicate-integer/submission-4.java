class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for(int n:nums) {
            if(!hashset.add(n)) {
                return true;
            }
        }
        return false;
    }
}