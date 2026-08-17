class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> mp = new HashMap<>();
        int n = names.length;
        for(int i=0;i<names.length;i++){
            mp.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        int idx = 0;
        for(int i=heights.length-1;i>=0;i--){
            names[idx++] = mp.get(heights[i]);
        }

        return names;
    }
}