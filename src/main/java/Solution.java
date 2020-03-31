import static java.lang.Math.floor;
import static java.lang.Math.pow;

import java.util.Arrays;

class Solution {
    public  int solution(int N) {
        if (N >= 100000000)
            return -1;
        else {
            int length = String.valueOf(N).length();
            int[] digits = new int[length];
            for (int i = length - 1; i > 0; i--) {
                digits[i] = (int) floor(N / pow(10, i));
                N = (int) (N - digits[i] * pow(10, i));
            }
            digits[0] = N;
            Arrays.sort(digits);
            int result = 0;

            for (int i = 0; i < length; i++) {

                result = (int) (result + digits[i] * pow(10, i));
            }

            return result;
        }

    }

}

