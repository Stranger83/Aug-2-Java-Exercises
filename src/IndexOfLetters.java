import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%s -> %d%n", input[i], (int)input[i] - 97);
        }
    }
}
