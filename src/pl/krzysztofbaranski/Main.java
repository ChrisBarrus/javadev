package pl.krzysztofbaranski;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {

        String firstName = "Krzysztof";
        String lastName = "B...";

        int age = 50;

        String result = showFullName(firstName, lastName, age);

        System.out.println(result);

    }

    private static String showFullName(String firstName, String lastName, int age) {

        return String.format("Your full name is %s %s, your age is: %d", firstName, lastName, age);

    }
}
