class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        soln = []
        for i in range(2):
            for i in range(len(nums)):
                soln.append(nums[i])
        return soln
        