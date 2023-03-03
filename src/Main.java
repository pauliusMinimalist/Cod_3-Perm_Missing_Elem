import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{2, 3, 1, 5}));
    }
}


class Solution {
    public int solution(int[] A) {
        int missingNumber = 0;
        int cout = -1;

        if (A.length != 0) {
            Arrays.sort(A);
            int min = A[0];
            int max = A[A.length - 1];

            for (int i = min; i < max - 1; i++) {
                cout++;

                if (i == A[cout]) {


                    missingNumber = i + 1;


                }


            }


            if (missingNumber == 0) {
                missingNumber = A[A.length - 1] + 1;
            }


        } else {
            return 1;
        }
        return missingNumber;
    }
}
