class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
                return;
            }

            int p1 = m - 1;
            int p2 = n - 1;
            for (int i = m + n - 1; i>= 0; i--) {

                int v1 = nums1[p1];
                int v2 = p2 >= 0 ? nums2[p2] : Integer.MIN_VALUE;
                if (v1 > v2) {
                    nums1[i] = nums1[p1--];
                } else {
                    nums1[i] = nums2[p2--];
                }
            }
        }
    }