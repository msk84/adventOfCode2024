package net.msk.adventOfCode;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day01HistorianHysteriaTest extends BaseTest {

    @Test
    void part1Example() {
        final List<Integer> left = List.of(3,4,2,1,3,3);
        final List<Integer> right = List.of(4,3,5,3,9,3);
        final int result = Day01_HistorianHysteria.calculateTotalDistance(left, right);
        assertEquals(11, result);
    }

    @Test
    void part1() throws IOException, URISyntaxException {
        final List<String> data = this.getDataFromFileAsList("day01_data");

        final List<Integer> left = new ArrayList<>();
        final List<Integer> right = new ArrayList<>();

        data.forEach(r -> {
            String[] row = r.split(" {3}");
            left.add(Integer.valueOf(row[0]));
            right.add(Integer.valueOf(row[1]));
        });

        final int result = Day01_HistorianHysteria.calculateTotalDistance(left, right);
        assertEquals(1189304, result);
    }

    @Test
    void part2Example() {
        final List<Integer> left = List.of(3,4,2,1,3,3);
        final List<Integer> right = List.of(4,3,5,3,9,3);
        final long result = Day01_HistorianHysteria.calculateSimilarityScore(left, right);
        assertEquals(31, result);
    }

    @Test
    void part2() throws IOException, URISyntaxException {
        final List<String> data = this.getDataFromFileAsList("day01_data");

        final List<Integer> left = new ArrayList<>();
        final List<Integer> right = new ArrayList<>();

        data.forEach(r -> {
            String[] row = r.split(" {3}");
            left.add(Integer.valueOf(row[0]));
            right.add(Integer.valueOf(row[1]));
        });

        final long result = Day01_HistorianHysteria.calculateSimilarityScore(left, right);
        assertEquals(24349736, result);
    }
}