import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String str = String.join("", input1);
        char[] arr1 = str.toCharArray();
        str = "";

        String[] input2 = scanner.nextLine().split(" ");
        str = String.join("", input2);
        char[] arr2 = str.toCharArray();

        for (int i = 0; i < input1.length; i++) {
            if (arr1[i] > arr2[i]) {
                System.out.println(arr2);
                System.out.println(arr1);
                break;
            } else if (arr1[i] < arr2[i]) {
                System.out.println(arr1);
                System.out.println(arr2);
                break;
            } else {
                if (arr1.length >= arr2.length) {
                    System.out.println(arr2);
                    System.out.println(arr1);
                    break;
                } else {
                    System.out.println(arr1);
                    System.out.println(arr2);
                    break;
                }
            }
        }
    }
}