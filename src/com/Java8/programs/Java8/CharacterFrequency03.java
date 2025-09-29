package com.Java8.programs.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency03 {

   public static void main(String[] args){
    String input = "Hello World";

       // ---------------------------------------------------------
       // Approach 1: Using groupingBy + counting
       // ---------------------------------------------------------

       Map<Character,Long> freqUsingGrouping = input.chars()
               .mapToObj( c->(char) c)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println("Approach 1 (groupingBy + counting): " + freqUsingGrouping);

       // ---------------------------------------------------------
       // Approach 2: Using toMap with merge function (Long::sum)
       // ---------------------------------------------------------

        Map<Character,Long> freqUsingToMap = input.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.toMap(
                        c ->c, // Key = character
                        c-> 1L, // Initial value = 1
                        Long::sum  // If duplicate key found → sum the counts

                ));

       System.out.println("Approach 2 (toMap + merge): " + freqUsingToMap);


       // ---------------------------------------------------------
       // Approach 3: Case-insensitive frequency
       // ---------------------------------------------------------


       Map<Character, Long> insensitivefrequency = input.toLowerCase()
               .chars()
               .mapToObj(c->(char) c)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                System.out.println("Approach 3 (Case-insensitive): " + insensitivefrequency);


       // ---------------------------------------------------------
       // Approach 4: Ignoring spaces
       // ---------------------------------------------------------


       Map<Character,Long>  Ignoringspaces  = input.replaceAll("\\s","")
               .chars()
               .mapToObj(c->(char) c)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println("Approach 4 (Ignoring spaces): " + Ignoringspaces);


       // Arrays of words
       List<String> allWords = Arrays.asList("apple","banana", "mango","banana","apple");
       Map<String,Long>  eachWord = allWords.stream()
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println("Counting of each word : " + eachWord);
   }





}



/*Notes
*The chars() method on a String returns an IntStream of Unicode code points.
Each element is an int, not a char
* String input = "hello";
input.chars().forEach(System.out::println);
// Output: 104 101 108 108 111  (Unicode values of 'h', 'e', 'l', 'l', 'o')

Converting int → char
* We use .mapToObj(c -> (char) c) to bridge the gap between the primitive IntStream returned by chars() and the object-based APIs (Stream<Character>) that collectors like groupingBy need.
* mapToObj converts primitive → object

mapToObj(c -> (char) c) casts each int to a char, and boxes it into Character.

This transforms the IntStream into a Stream<Character>, which works with Collectors.groupingBy.
*
* It’s commonly used when you need a function that just returns the value itself, especially in Collectors.toMap, groupingBy, etc
*Function.identity() means “use the element itself as the key”
*
*Collectors.counting() returns a Long count of elements.

Mostly used with groupingBy to count frequency.

Equivalent to stream.count(), but fits inside collector
*
* Why this works

toMap by default throws an error if it finds duplicate keys.

You provide Long::sum to say “if key exists, add the values”.

That’s why it counts frequencies.
*
 */
