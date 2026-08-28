package com.chilliess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GradeAnalyzerStatementTest {
    @Test
    void analyzesEmptyInput() {
        assertEquals("Passed: 0, Failed: 0", GradeAnalyzer.analyze(new int[] {}));
    }

    @Test
    void countsPassedScores() {
        assertEquals("Passed: 2, Failed: 0", GradeAnalyzer.analyze(new int[] {50, 72}));
    }

    @Test
    void countsFailedScores() {
        assertEquals("Passed: 0, Failed: 2", GradeAnalyzer.analyze(new int[] {35, 48}));
    }
}