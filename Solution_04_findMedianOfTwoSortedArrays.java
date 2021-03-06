class Solution_04_findMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double median;
        int m = nums1.length;
        int n = nums2.length;
        int merged_array[] = new int[m+n];
        int i = 0; 
        int j = 0;
        int k = 0;
        while(i < m)
        {
            merged_array[k++] = nums1[i++];
        }
        while(j < n)
        {
            merged_array[k++] = nums2[j++];
        }
        Arrays.sort(merged_array);
        int mid = (m+n)/2;
        if((m+n)%2 == 0)
        {
            median = (double)(merged_array[mid-1] + merged_array[mid])/2;
        }
        else
        {
            median = merged_array[mid];
        }
        return median;
    }
}
