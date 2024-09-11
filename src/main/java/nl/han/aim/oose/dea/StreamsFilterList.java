package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        return input.stream()
                .filter(this::shorterThanThreeCharacters)
                .toList();
    }

    boolean shorterThanThreeCharacters(String s) {
        return s.length() < 3;
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        return input.stream()
                .filter(this::containsOnlyNumerals)
                .toList();
    }
}
