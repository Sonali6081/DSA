// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        String nStr = Integer.toString(n);
        int count = 0;
        
        for (char ch : nStr.toCharArray()) {
            int digit = ch - '0'; // converting char to int
            
            // ignore 0 digit
            if (digit == 0) {
                continue;
            }
            
            if (n % digit == 0) {
                count++;
            }
        }
        
        return count;
    }
}