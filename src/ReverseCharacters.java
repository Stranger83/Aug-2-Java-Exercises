import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb =  new StringBuilder();

        char ch1 = scanner.nextLine().charAt(0);
        char ch2 = scanner.nextLine().charAt(0);
        char ch3 = scanner.nextLine().charAt(0);
        sb.append(ch1);
        sb.append(ch2);
        sb.append(ch3);
        sb.reverse();
        System.out.println(sb);
    }
}
