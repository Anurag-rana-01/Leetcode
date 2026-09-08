class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore); 

        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rank = n - i; 
            if (rank == 1) rankMap.put(sortedScore[i], "Gold Medal");
            else if (rank == 2) rankMap.put(sortedScore[i], "Silver Medal");
            else if (rank == 3) rankMap.put(sortedScore[i], "Bronze Medal");
            else rankMap.put(sortedScore[i], String.valueOf(rank));
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }

        return result;
    }
}