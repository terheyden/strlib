package com.terheyden.str;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * StrTest unit tests.
 */
public class StrTest {

    private static final String STR_NULL = null;

    @Test
    public void test() {

        assertEquals("Cora is 10.", Str.format("{} is 10.", "Cora"));
        assertEquals("Cora is 10", Str.format("Cora is {}", 10));
        assertEquals("Cora is 10!", Str.format("{} is {}!", "Cora", 10));
    }

    @Test
    public void testMore() {

        assertEquals("Cora is 10.", Str.format("{} is 10.", "Cora"));
        assertEquals("Cora is 10", Str.format("Cora is {}", 10));
        assertEquals("Cora is 10!", Str.format("{} is {}!", "Cora", 10));
        assertEquals("Nulls are null.", Str.format("Nulls are {}.", STR_NULL));
        assertEquals("Ignore my \\{} placeholder, okay?", Str.format("Ignore my \\{} placeholder, {}?", "okay"));
        assertEquals("Ignore my missing {} args {} !", Str.format("Ignore {} missing {} args {} !", "my"));
        assertEquals("Extra args at the end: one, two, three", Str.format("Extra args at the {}: ", "end", "one", "two", "three"));
    }

    @Test
    public void testEdges() {

        assertEquals("123", Str.format("1{}3", 2));
        assertEquals("12", Str.format("{}2", 1));
        assertEquals("12", Str.format("1{}", 2));
        assertEquals("1{23", Str.format("1{{}", 2, 3));
        assertEquals("1{2}3", Str.format("1{{}}3", 2));
        assertEquals("hello", Str.format("hello", null));
        assertEquals("hellonull", Str.format("hello", STR_NULL));
        assertEquals("hello", Str.format(null, "hello"));
        assertEquals("null", Str.format(STR_NULL, STR_NULL));
        assertEquals("1, 2, 3", Str.format(null, 1, 2, 3));
    }

    @Test
    public void testArrays() {

        assertEquals("1 and 2 also 3", Str.format("{} and {} also {}", new Object[] { 1, 2, 3 }));
    }
}
