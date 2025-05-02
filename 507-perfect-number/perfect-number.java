class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) return false;

        int sumOfDivisors = 1; 
        int maxCheck = (int) Math.sqrt(num); 

        for (int i = 2; i <= maxCheck; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
                int complement = num / i;

                if (complement != i) {
                    sumOfDivisors += complement;
                }
            }
        }
        return sumOfDivisors == num;
    }
}
