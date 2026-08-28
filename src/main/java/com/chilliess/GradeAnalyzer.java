package com.chilliess;

public class GradeAnalyzer {
    public static String analyze(int[] scores) {
        int passed = 0;
        int failed = 0;

        for (int score : scores) {
            if (score >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        return "Passed: " + passed + ", Failed: " + failed;
    }

    public static void main(String[] args) {
        int[] scores = {35, 50, 72, 48};
        System.out.println(analyze(scores));
    }
}