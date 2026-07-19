class Solution:
    def sortColors(self, arr: List[int]) -> None:
        start = 0
        mid = 0
        end = len(arr)-1
        while mid <= end :
            if arr[mid] == 0 :
                arr[mid], arr[start] = arr[start], arr[mid]
                start += 1
                mid += 1
            elif arr[mid] == 1 :
                mid += 1
            else:
                arr[mid], arr[end] = arr[end], arr[mid]
                end -= 1
        
        return arr
        