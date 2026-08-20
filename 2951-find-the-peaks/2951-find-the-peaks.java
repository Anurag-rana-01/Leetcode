class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]){
                l1.add(i);
            }
        }
        return l1;
    }
}