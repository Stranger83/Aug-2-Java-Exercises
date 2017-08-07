import java.util.Arrays;
import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);
        char[] vowels = "aouieAOUIE".toCharArray();
        boolean isVowel = false;
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]){
                isVowel = true;
                break;
            }
        }
        if (Character.isDigit(ch)){
            System.out.println("digit");
        } else  if (isVowel){
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
