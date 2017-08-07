import java.util.Arrays;
import java.util.Scanner;

public class MaxSeqOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bestLen = 1;
        int bestPos = 0;
        int currentLen = 1;
        int currentPos = 0;
        for (int pos = 1; pos < nums.length; pos++) {
            if (nums[pos] > nums[pos - 1]) {
                currentLen++;
                if (currentLen > bestLen) {
                    bestLen = currentLen;
                    bestPos = currentPos;
                }
            } else {
                currentPos = pos;
                currentLen = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = bestPos; i < bestPos + bestLen; i++) {
            sb.append(nums[i] + " ");
        }
        System.out.println(sb);
    }
}