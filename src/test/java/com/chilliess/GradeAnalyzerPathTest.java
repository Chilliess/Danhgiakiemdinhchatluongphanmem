package com.chilliess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GradeAnalyzerPathTest {
    @Test
    void followsZeroIterationPath() {
        assertEquals("Passed: 0, Failed: 0", GradeAnalyzer.analyze(new int[] {}));
    }

    @Test
    void followsRepeatedPassedBranchPath() {
        assertEquals("Passed: 3, Failed: 0", GradeAnalyzer.analyze(new int[] {50, 60, 70}));
    }

    @Test
    void followsRepeatedFailedBranchPath() {
        assertEquals("Passed: 0, Failed: 3", GradeAnalyzer.analyze(new int[] {10, 20, 49}));
    }

    @Test
    void followsPassedThenFailedPath() {
        assertEquals("Passed: 1, Failed: 1", GradeAnalyzer.analyze(new int[] {50, 49}));
    }

    @Test
    void followsFailedThenPassedPath() {
        assertEquals("Passed: 1, Failed: 1", GradeAnalyzer.analyze(new int[] {49, 50}));
    }
}