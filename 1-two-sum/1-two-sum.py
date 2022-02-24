class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        number_index_map = {}
        for index, value in enumerate(nums):
            if target - value in number_index_map:
                return [index, number_index_map[target-value]]
            number_index_map[value]=index
                        
                
                