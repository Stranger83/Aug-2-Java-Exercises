import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += input.charAt(input.length() - 1 - i);
        }
        System.out.println(output);
    }
}
