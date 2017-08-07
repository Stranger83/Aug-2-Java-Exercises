import java.util.Scanner;

public class CensorEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] fullEmail = scanner.nextLine().split("@");
        String text = scanner.nextLine();

        String username = fullEmail[0];
        String domain = fullEmail[1];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < username.length(); i++) {
            sb.append("*");
        }
        String output = text.replaceAll((username + "@" + domain), (sb + "@" + domain));

        System.out.println(output);
    }
}