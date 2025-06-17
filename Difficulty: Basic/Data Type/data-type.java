// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        switch (str) {
            case "Character":
                return 1;  // Assuming it's for C/C++ where char is 1 byte
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            default:
                return -1;
        }
    }
}