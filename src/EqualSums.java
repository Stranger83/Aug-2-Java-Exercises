import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            long leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            long righSum = 0;
            for (int k = i + 1; k < arr.length; k++) {
                righSum += arr[k];
            }

            if (leftSum == righSum) {
                index = i;
            }

        }
        if (index != Integer.MIN_VALUE) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}