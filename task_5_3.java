import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution_sorted {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0;
        int p2 = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (p1 < nums1.length && p2 < nums2.length) {
            int val1 = nums1[p1];
            int val2 = nums2[p2];

            if (val1 == val2) {
                list.add(val1);
                p1++;
                p2++;
            } else if (val1 < val2) {
                p1++;
            } else {
                p2++;
            }
        }

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;

    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // from number to its appearance count
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // time: O(N), space: O(N)
        for (int i : nums1) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : nums2) {
            if (hm.containsKey(i)) {
                if (hm.get(i) > 1) {
                    hm.put(i, hm.get(i) - 1);
                } else {
                    hm.remove(i);
                }

                list.add(i);
            }
        }

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}