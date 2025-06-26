class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0; // To count the number of open parentheses
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Only add if not the outermost
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++;
            } else {
                openCount--;
                // Only add if not the outermost
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}