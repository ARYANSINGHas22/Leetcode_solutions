class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        Output =  []

        for i in range(len(nums)):
            if i == 0:
                Output.append(nums[i])
            else:
                Output.append(Output[i-1] + nums[i])
        return Output
        