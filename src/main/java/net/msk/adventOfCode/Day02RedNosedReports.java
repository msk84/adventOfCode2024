package net.msk.adventOfCode;

import java.util.List;

public class Day02RedNosedReports {

    private static final int MAGIC_BREAK = -10000;

    public static long calculateNumberOfSafeReports(final List<List<Integer>> reportList) {
        return reportList.stream()
                .filter(l -> isSteady(l, true) || isSteady(l, false))
                .count();
    }

    public static boolean isSteady(final List<Integer> sequence, final boolean up) {
        return !sequence.stream()
                .reduce((l, r) -> {
                    if (!(l.compareTo(r) == (up ? 1 : -1) && (Math.abs(l - r) < 4))) {
                        return MAGIC_BREAK;
                    }
                    return r;
                })
                .orElse(MAGIC_BREAK)
                .equals(MAGIC_BREAK);
    }
}
