class Solution2 {
    public int solution(int[] A, int K, int L) {
        if (K < L) {
            System.out.println("Invalid");
            return -1;
        }

        int result = 0;
        for (int i = 0; i < L; i++)
            result += A[i];

        int currentSum = result;
        for (int i = L; i < K; i++) {
            currentSum += A[i] - A[i - L];
            result = Math.max(result, currentSum);
        }

        return result;
    }

}

