package booklibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library() {{
            setName("Penguin Books");
            setBooks(new ArrayList<>());
        }};
        int n = Integer.parseInt(scanner.nextLine());
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Book book = new Book() {{
                setTitle(input[0]);
                setAuthor(input[1]);
                setPublisher(input[2]);
                setReleaseDate(LocalDate.parse(input[3], df));
                setIsbn(input[4]);
                setPrice(Double.parseDouble(input[5]));
            }};
            library.getBooks().add(book);
        }
        library.getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.summingDouble(Book::getPrice)))
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int comparisonResult = Double.compare(b.getValue(), a.getValue());
                    if (comparisonResult == 0) {
                        comparisonResult = a.getKey().compareTo(b.getKey());
                    }
                    return comparisonResult;
                })
                .forEach(kvp -> {
                    System.out.print(kvp.getKey() + " -> ");
                    System.out.printf("%.2f%n", kvp.getValue());
                });
    }
}