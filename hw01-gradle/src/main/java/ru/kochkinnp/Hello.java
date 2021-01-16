package ru.kochkinnp;

import java.util.List;
import com.google.common.collect.Lists;

public class Hello {
    public static void main(String[] args) {
        List<String> helloWords = List.of("!", "world", "Hello");
        Lists.reverse(helloWords).forEach(System.out::println);
    }
}
