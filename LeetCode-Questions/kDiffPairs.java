// Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

// A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
//532-LEETCODE
////////////METHOD - 1/////////////////////
class Solution {
    public int findPairs(int[] nums, int k) {

            Arrays.sort(nums);
            int i = 0, j = 0;
            HashSet<Pair<Integer, Integer>> ans = new HashSet<>();

            while (j < nums.length) {
                int diff = nums[j] - nums[i];
                if (diff == k) {
                    ans.add(new Pair<>(nums[i], nums[j]));
                    i++;
                    j++;
                } 
                else if (diff > k) {
                    i++;
                }
                else 
                    j++;

                if(i==j) j++;
              } 
              return ans.size();
    }
}