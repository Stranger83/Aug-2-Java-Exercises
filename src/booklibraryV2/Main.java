package booklibraryV2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

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
        LocalDate minReleaseDate = LocalDate.parse(scanner.nextLine(), df);
        Book[] sortedBooks = library.getBooks().stream()
                .filter(b -> b.getReleaseDate().isAfter(minReleaseDate))
                .sorted((a, b) -> {
                    int comparisonResult = a.getReleaseDate().compareTo(b.getReleaseDate());
                    if (comparisonResult == 0) {
                        comparisonResult = a.getTitle().compareTo(b.getTitle());
                    }
                    return comparisonResult;
                })
                .toArray(Book[]::new);

        for (Book book : sortedBooks) {
            System.out.printf("%s -> %s%n", book.getTitle(), df.format(book.getReleaseDate()));
        }
    }
}