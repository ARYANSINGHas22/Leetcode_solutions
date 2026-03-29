class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] rowMin = new int[n];
        int[] colMax = new int[m];

        // Step 1: Initialize
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(colMax, Integer.MIN_VALUE);

        // Step 2: Fill rowMin and colMax
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                colMax[j] = Math.max(colMax[j], matrix[i][j]);
            }
        }

        // Step 3: Compare
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}