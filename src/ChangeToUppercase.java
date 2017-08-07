import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (true){
            int firstTagPos = text.indexOf("<upcase>");
            if (firstTagPos < 0){
                break;
            }
            int firstClosingTagPos  = text.indexOf("</upcase>");
            String textToBeReplaced = text.substring(firstTagPos, firstClosingTagPos + 9);
            String upperCaseText = text.substring(firstTagPos + 8, firstClosingTagPos).toUpperCase();
            text = text.replace(textToBeReplaced, upperCaseText);
        }
        System.out.println(text);
    }
}