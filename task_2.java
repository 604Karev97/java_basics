class Solution {
    public int climbStairs(int n) {
			if (n <= 0) {
				return 0;
			}

			return dfs(n, 0);
		}

		private int dfs(int n, int current) {

			if (current > n) {
				return 0;
			}

			if (current == n) {
				return 1;
			}

			return dfs(n, current + 1) + dfs(n, current + 2);
		}
	}
