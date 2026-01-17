class Solution {

    int[] memo;

    public int numTrees(int n) {
        memo = new int[n + 1];
        return countBST(n);
    }

    private int countBST(int n) {

        // base cases
        if (n == 0 || n == 1) return 1;

        // already calculated
        if (memo[n] != 0) return memo[n];

        int total = 0;

        // try every number as root
        for (int root = 1; root <= n; root++) {
            int left = countBST(root - 1);
            int right = countBST(n - root);
            total += left * right;
        }

        memo[n] = total;
        return total;
    }
}
