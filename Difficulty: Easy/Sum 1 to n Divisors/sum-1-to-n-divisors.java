class Solution {
    public static long sumOfDivisors(long n) {
        long totalSum = 0;

        // Iterate through each potential divisor
        for (long k = 1; k <= n; k++) {
            // Add k to the sum for each multiple of k up to n
            long multiple = k;
            while (multiple <= n) {
                totalSum += k;
                multiple += k;
            }
        }

        return totalSum;
    }
}