package org.ironhack.lab_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddCheckerTest {

    OddChecker oddChecker;
    @BeforeEach
    void setUp() {
        oddChecker = new OddChecker();
    }

    @Test
    void oddListGenerator() {
        int[] expect = {};
        assertArrayEquals(expect, oddChecker.oddListGenerator(0));
    }
}