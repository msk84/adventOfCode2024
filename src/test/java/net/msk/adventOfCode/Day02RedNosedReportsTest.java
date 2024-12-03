package net.msk.adventOfCode;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Day02RedNosedReportsTest extends BaseTest {

    @Test
    void part1ExampleCalculateNumberOfSafeReports() {
        final List<List<Integer>> inputData = new ArrayList<>();
        inputData.add(this.convertLineToIntList("7 6 4 2 1"));
        inputData.add(this.convertLineToIntList("1 2 7 8 9"));
        inputData.add(this.convertLineToIntList("9 7 6 2 1"));
        inputData.add(this.convertLineToIntList("1 3 2 4 5"));
        inputData.add(this.convertLineToIntList("8 6 4 4 1"));
        inputData.add(this.convertLineToIntList("1 3 6 7 9"));

        final long result = Day02RedNosedReports.calculateNumberOfSafeReports(inputData);
        assertEquals(2, result);
    }

    @Test
    void part1() throws IOException, URISyntaxException {
        final List<String> data = this.getDataFromFileAsList("day02_data");
        final List<List<Integer>> inputData = data.stream().map(this::convertLineToIntList).toList();

        final long result = Day02RedNosedReports.calculateNumberOfSafeReports(inputData);
        assertEquals(314, result);
    }

    private List<Integer> convertLineToIntList(final String line) {
        return Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}