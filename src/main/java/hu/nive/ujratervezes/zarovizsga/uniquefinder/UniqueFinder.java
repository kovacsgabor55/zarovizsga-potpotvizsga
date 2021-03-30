package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> uniqueChars(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input value cannot be null.");
        }
        List<Character> result = new ArrayList<>();
        for (Character item : input.toCharArray()) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
