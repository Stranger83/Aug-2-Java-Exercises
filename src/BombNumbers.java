import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bomb = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> finalNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            finalNums.add(nums[i]);
        }

        int bombNum = bomb[0];
        int bombPower = bomb[1];

        for (int i = 0; i < finalNums.size(); i++) {
            if (finalNums.get(i) == bombNum) {
                int leftIndex = Math.max(i - bombPower, 0);
                int rightIndex = Math.min(i + bombPower, finalNums.size() - 1);
                finalNums.subList(leftIndex, rightIndex + 1).clear();
                i = -1;
            }
        }
        int sum = 0;

        for (Integer finalNum : finalNums) {
            sum += finalNum;
        }
        System.out.println(sum);
    }
}