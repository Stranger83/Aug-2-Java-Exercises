import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxCount = 0;
        int maxNum = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentCount++;
                }
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxNum = arr[i];
                }
            }
        }
        System.out.println(maxNum);
    }
}