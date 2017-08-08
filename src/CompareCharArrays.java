import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String str = String.join("", input1);
        char[] arr1 = str.toCharArray();

        String[] input2 = scanner.nextLine().split(" ");
        str = String.join("", input2);
        char[] arr2 = str.toCharArray();

        int arr1Value = 0;
        int arr2Value = 0;

        int len = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < len; i++) {
           if (arr1[i] > arr2[i]){
               arr1Value++;
           } else if (arr1[i] < arr2[i]) {
               arr2Value++;
           }
        }
        if (arr1Value > arr2Value || arr1.length > arr2.length) {
            System.out.println(arr2);
            System.out.println(arr1);
        } else {
            System.out.println(arr1);
            System.out.println(arr2);
        }
    }
}