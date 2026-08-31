class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        soln = []
        for i in range(2):
            for n in nums:
                soln.append(n)
        return soln
