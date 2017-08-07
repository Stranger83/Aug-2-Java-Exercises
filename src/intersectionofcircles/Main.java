package intersectionofcircles;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Circle c1 = new Circle(new Point(input1[0], input1[1]), input1[2]);
        Circle c2 = new Circle(new Point(input2[0], input2[1]), input2[2]);

        boolean intersect = c1.intersect(c2);
        System.out.println(intersect ? "Yes" : "No");
    }
}