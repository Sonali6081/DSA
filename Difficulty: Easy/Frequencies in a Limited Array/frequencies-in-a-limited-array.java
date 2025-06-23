class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n= arr.length;
        List<Integer> result = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            result.add(0);
        }
        for(int num : arr){
            result.set(num-1, result.get(num-1)+1);
        }
        return result;
    }
}
