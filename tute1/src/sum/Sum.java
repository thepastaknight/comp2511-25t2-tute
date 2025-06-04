package sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputList = input.split(" ");

        int total = 0;
        for (String str : inputList) {
            total += Integer.parseInt(str);
        }

        System.out.println(total);
        scanner.close();
    }
}
