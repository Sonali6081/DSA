class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int n = s.length();
        // Skip leading white spaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }
        
        // Check for sign
        int sign = 1;
        if (index < n && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if (s.charAt(index) == '-') {
                sign = -1;
            }
            index++;
        }
        
        long num = 0; // use long to handle overflow temporarily
        // Read digits
        while (index < n && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            num = num * 10 + (s.charAt(index) - '0');
            // Check for overflow / underflow
            if (sign * num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign * num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        
        return (int)(sign * num);
    }
}