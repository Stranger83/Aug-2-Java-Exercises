import java.util.Scanner;

public class FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        if (str.length() >= 20) {
            System.out.println(str.substring(0,20));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (int i = 0; i < 20 - str.length(); i++) {
                sb.append("*");
            }
            System.out.println(sb);
        }
    }
}
