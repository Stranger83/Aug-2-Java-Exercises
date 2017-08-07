import java.util.LinkedHashMap;
        import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (!input.equals("END")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];
            String name = tokens[1];
            if (command.equals("A")) {
                String number = tokens[2];
                phonebook.put(name, number);
            } else {
                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s%n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }
            input = scanner.nextLine();
        }
    }
}