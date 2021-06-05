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
    public void testMore() {

        assertEquals("Cora is 10.", Str.format("{} is 10.", "Cora"));
        assertEquals("Cora is 10", Str.format("Cora is {}", 10));
        assertEquals("Cora is 10!", Str.format("{} is {}!", "Cora", 10));
        assertEquals("Nulls are null.", Str.format("Nulls are {}.", null));
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
        assertEquals("hellonull", Str.format("hello", null));
        assertEquals("hello", Str.format(null, "hello"));
        assertEquals("null", Str.format(null, null));
        assertEquals("1, 2, 3", Str.format(null, 1, 2, 3));
    }
}
