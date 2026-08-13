class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }

        int[] arr = new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        for(int i=min;i<max+1;i++){
            if(arr[i] == 0){
                numbers.add(i);
            }
        }
        return numbers;
    }
}