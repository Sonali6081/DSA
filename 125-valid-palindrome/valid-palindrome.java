class Solution {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase and remove non-alphanumeric characters
        String filtered = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Check if the filtered string is a palindrome
        int left = 0;
        int right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
}