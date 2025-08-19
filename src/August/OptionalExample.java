package August;

import java.util.Optional;

public class OptionalExample{

    public static void main(String[] args) {
        // Create an instance to call the non-static method
        OptionalExample example = new OptionalExample();

        // 1. A case where the name is present
        Optional<String> result1 = example.st("Pranav");
        result1.ifPresent(name -> System.out.println("Result 1: " + name));

        // 2. A case where the name is null
        Optional<String> result2 = example.st("");
        // This won't print anything because the Optional is empty
        result2.ifPresent(name -> System.out.println("Result 2: " + name));

        // Use orElse() to provide a default value
        String finalName = result2.orElse("Default Name");
        System.out.println("Final Name: " + finalName);
    }

    /**
     * This method safely handles a potentially null input string
     * and wraps it in an Optional.
     * * @param name The input string, which may be null.
     * @return An Optional containing the string if it's not null,
     * otherwise an empty Optional.
     */
    public Optional<String> st(String name) {
        System.out.println("Input received: " + name);

        // The correct way to handle a potentially null value with Optional
        // This is much safer than `Optional.of(name)` which would throw a NullPointerException
        // if `name` is null.
        return Optional.ofNullable(name);
    }
}