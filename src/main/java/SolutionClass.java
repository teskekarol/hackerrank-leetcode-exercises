import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SolutionClass {

    static char LEFT_OPEN_BRACKET = '<';
    static char RIGHT_OPEN_BRACKET = '>';

    public static int collision(List<Integer> speeds, int pos) {
        List<Integer> left = speeds.subList(0, pos);
        List<Integer> right = speeds.subList(pos, speeds.size());
        int posSpeed = speeds.get(pos);

        return countCollisions(left, posSpeed, (a, b) -> a > b) + countCollisions(right, posSpeed, (a, b) -> a < b);
    }

    private static int countCollisions(List<Integer> right, int posSpeed, BiFunction<Integer, Integer, Boolean> compareFun) {
        int collissions = 0;

        for (int speed : right) {
            if (compareFun.apply(speed, posSpeed)) {
                collissions++;
            }
        }
        return collissions;
    }

    public static List<Integer> balancedOrNot(List<String> expressions, final List<Integer> maxReplacements) {
        return IntStream
            .range(0, expressions.size())
            .map(i -> mapToOneIfBalanced(expressions.get(i), maxReplacements.get(i)))
            .boxed()
            .collect(Collectors.toList());
    }
    private static int mapToOneIfBalanced(String expression, Integer maxReplacement) {
        if (isBalanced(expression, maxReplacement)) {
            return 1;
        } else {
            return 0;
        }
    }

    private static boolean isBalanced(String s, Integer maxReplacements) {
        int openedBracketsCounter = 0;
        int closeUnopenedBracketsCounter = 0;
        for (char nextChar : s.toCharArray()) {

            if (nextChar == LEFT_OPEN_BRACKET) {
                openedBracketsCounter++;
            } else {
                if (nextChar == RIGHT_OPEN_BRACKET) {
                    if (openedBracketsCounter > 0) {
                        openedBracketsCounter--;
                    } else {
                        closeUnopenedBracketsCounter++;
                    }
                }
            }
        }

        return openedBracketsCounter == 0 && closeUnopenedBracketsCounter <= maxReplacements;
    }

    public static int minDiff(List<Integer> arr) {
        List<Integer> sorted = arr.stream()
            .sorted()
            .collect(Collectors.toList());

        int sumOfDiffs = 0;
        for (int i = 1; i < sorted.size(); i++) {
            int diff = sorted.get(i) - sorted.get(i - 1);
            sumOfDiffs += diff;
        }
        return sumOfDiffs;
    }

    public static int shortestSubstring(String givenString) {
        Set<Character> allChars = toCharacters(givenString);

        int minimumLen = allChars.size();
        while (true) {
            for (int i = 0; i <= givenString.length() - minimumLen; i++) {
                int right = i + minimumLen;
                String cut = givenString.substring(i, right);
                if (allChars.equals(toCharacters(cut))) {
                    return cut.length();
                }
            }
            minimumLen += 1;
        }
    }

    @NotNull
    private static Set<Character> toCharacters(String cut) {
        return cut.chars()
            .mapToObj(e -> (char) e)
            .collect(Collectors.toSet());
    }
}
