package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter22 {

    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        System.out.println(firstRepeatedChar);

    }


}

/*Notes
*
*
* "Java Concept Of The Day" — the original string.

.replaceAll("\\s+", "") —

\\s+ is a regular expression that matches all whitespace (spaces, tabs, newlines).

Replaces them with an empty string "" (removes all spaces).
 After this: "JavaConceptOfTheDay"

.toLowerCase() — converts all characters to lowercase to make counting case-insensitive.
 Final result: "javaconceptoftheday"
*
*inputString.split("") — splits the string into an array of individual characters.
 Example: ["j", "a", "v", "a", "c", "o", "n", "c", "e", "p", "t", "o", "f", "t", "h", "e", "d", "a", "y"]

Arrays.stream(...) — converts this array into a Stream<String> so you can use Stream API methods.
*
*
* .collect(...) — terminal operation to collect stream elements into a Map.

Collectors.groupingBy(...) — groups elements based on a classifier (here: each unique character).

Function.identity() — returns each element itself as the key (i.e., each character).

LinkedHashMap::new — tells it to use a LinkedHashMap (preserves the order of characters as they appeared).

Collectors.counting() — counts how many times each character appears
*
*
* The result is a map like
*
* {j=1, a=3, v=1, c=2, o=2, n=1, e=2, p=1, t=2, f=1, h=1, d=1, y=1}

* charCountMap.entrySet() — returns a set of all key-value pairs (Map.Entry<String, Long>).

This will be used to stream through each character and its frequency.
*
* Converts the entry set into a Stream so you can process it with filters and mappings.
*
* Keeps only those entries where the value (count) is greater than 1.
That means: only repeated characters.
*
* Extracts only the key (character) from each filtered entry.
After this step, you have a stream of repeated characters like ["a", "c", "o", "e", "t"]
*
* Retrieves the first element from the stream (based on original insertion order from LinkedHashMap).
*
* This ensures you get the first repeated character in the string.
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */