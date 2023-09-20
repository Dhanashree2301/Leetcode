class Solution(object):
    def merge(self, nums1, m, nums2, n):
        #FIRST SOLUTION
        """for i in range(n):
            nums1.pop()
        nums1+=nums2
        print(nums1.sort())
        
        
        #SECOND SOLUTION
        """
        for i in range(n):
            nums1[m+i]=nums2[i]
        nums1.sort()
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
       
        