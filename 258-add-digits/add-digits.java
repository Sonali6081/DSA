class Solution {
    public int addDigits(int num) {
     if(num==0){
        return 0;
     } else{
        return 1 + ((num-1)%9);
     }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        Solution sol = new Solution();
        int result = sol.addDigits(num);
        System.out.println(result);
    }
    }
