class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex =i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}