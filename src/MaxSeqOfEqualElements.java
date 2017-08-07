import java.util.Arrays;
import java.util.Scanner;

public class MaxSeqOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bestLen = 1;
        int bestPos = 0;
        int currentLen = 1;
        for (int pos = 0; pos < nums.length; pos++) {
            if (pos < nums.length - 1 && nums[pos] == nums[pos + 1]) {
                currentLen++;
            }
            else {
                currentLen = 1;
            }
            if (currentLen > bestLen) {
                bestLen = currentLen;
                bestPos = pos;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bestLen; i++) {
            sb.append(nums[bestPos] + " ");
        }

        System.out.println(sb);
    }
}
