package com.terheyden.str;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * StrTest unit tests.
 */
public class StrTest {

    @Test
    public void test() {

        assertEquals("Cora is 10.", Str.format("{} is 10.", "Cora"));
        assertEquals("Cora is 10", Str.format("Cora is {}", 10));
        assertEquals("Cora is 10!", Str.format("{} is {}!", "Cora", 10));
    }

    @Test
    public void testSplitOne() {

        assertEquals("123", Str.format("1{}3", 2));
        assertEquals("12", Str.format("{}2", 1));
        assertEquals("12", Str.format("1{}", 2));
        assertEquals("1{23", Str.format("1{{}", 2, 3));
        assertEquals("1{2}3", Str.format("1{{}}3", 2));
    }

    @Test
    public void testSplit2Two() {

        assertEquals("12345", Str.format("1{}3{}5", 2, 4));
        assertEquals("1234", Str.format("{}2{}4", 1, 3));
        assertEquals("1234", Str.format("1{}3{}", 2, 4));
        assertEquals("1{23{45", Str.format("1{{}3{{}", 2, 4, 5));
        assertEquals("{1}2{3}4", Str.format("{{}}2{{}}4", 1, 3));
    }
}
