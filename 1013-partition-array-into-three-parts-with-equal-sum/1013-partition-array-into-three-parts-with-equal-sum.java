class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int val : arr){
            sum += val;
        }

        if(sum%3 != 0){
            return false;
        }

        int target = sum/3;
        int currentsum = 0;
        int count = 0;

        for(int i=0;i<arr.length-1;i++){
            currentsum += arr[i];
            if(currentsum == target){
                count++;
                currentsum = 0;

                if(count == 2){
            return true;
        }
            }
        }

        return false;
    }
}