import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<String, String> phonebook = new TreeMap<>();

        while (!input.equals("END")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("A")) {
                String name = tokens[1];
                String number = tokens[2];
                phonebook.put(name, number);
            } else if (command.equals("S")){
                String name = tokens[1];
                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s%n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            } else if (command.equals("ListAll")){

                for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                    System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
                }
            }
            input = scanner.nextLine();
        }
    }
}