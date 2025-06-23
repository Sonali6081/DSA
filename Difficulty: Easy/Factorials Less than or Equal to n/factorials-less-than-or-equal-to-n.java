// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
    ArrayList<Long> result = new ArrayList<>();
    long factorial=1;
    long i=1;
    result.add(factorial);
    while(true){
        i++;
        factorial *= i;
        if(factorial > n){
            break;
        }
        result.add(factorial);
    }
    return result;
    }
}