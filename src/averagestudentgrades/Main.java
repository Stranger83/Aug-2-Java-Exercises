package averagestudentgrades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            Double[] grades = Arrays.stream(tokens)
                    .skip(1)
                    .map(Double::parseDouble)
                    .toArray(Double[]::new);

            Student student = new Student() {{
                setName(name);
                setGrades(Arrays.asList(grades));
            }};
            students.add(student);
        }
        Student[] filteredStudents = students.stream()
                .filter(s -> s.getAverageGrade() >= 5.00)
                .sorted((a,b) -> {
                int comparisonResult = a.getName().compareTo(b.getName());
                if (comparisonResult == 0) {
                    comparisonResult = Double.compare(b.getAverageGrade(), a.getAverageGrade());
                }
                return comparisonResult;
                })
                .toArray(Student[]::new);

        for (Student filteredStudent : filteredStudents) {
            System.out.printf("%s -> %.2f%n", filteredStudent.getName(), filteredStudent.getAverageGrade());
        }
    }
}