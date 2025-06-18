
// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd = gcd(a, b);
        int lcm = Math.abs(a * b) / gcd;
        return new int[] {lcm, gcd};
    }

    // Helper method for GCD
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}