package net.msk.adventOfCode;

import java.util.List;

//https://adventofcode.com/2024/day/1
public class Day01HistorianHysteria {

    public static int calculateTotalDistance(final List<Integer> left, final List<Integer> right) {

        final List<Integer> leftSorted = left.stream().sorted().toList();
        final List<Integer> rightSorted = right.stream().sorted().toList();

        int distance = 0;
        int i = 0;
        for(int l : leftSorted) {
            distance += Math.abs(l - rightSorted.get(i++));
        }

        return distance;
    }

    public static long calculateSimilarityScore(final List<Integer> left, final List<Integer> right) {
        return left.stream()
                .mapToLong(i -> right.stream()
                            .filter(r -> r.equals(i))
                            .count() * i
        ).sum();
    }
}
