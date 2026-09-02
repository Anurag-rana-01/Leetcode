class Solution {
    public int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] arr1 = new int[max+1];

        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }

        int max1 = -1;
        for(int i=1;i<arr1.length;i++){
            if(arr1[i] == i && arr1[i] > max1){
                max1 = arr1[i];
            } 
        }
        return max1;
    }
}