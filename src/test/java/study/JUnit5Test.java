package study;

import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;
import static org.assertj.core.api.AssertionsForClassTypes.fail;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import org.junit.jupiter.api.Test;

public class JUnit5Test {

    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = { 'J', 'u', 'p', 'i', 't'};
        char[] actual = "Jupit".toCharArray();

        assertArrayEquals(expected, actual, "두 배열이 일치하지 않습니다.");
    }

    @Test
    public void whenAssertingEquality_thenEqual() {
        float square = 2 * 2;
        float rectangle = 2 * 2;

        assertEquals(square, rectangle);
    }

    @Test
    void whenAssertingEqualityWithDelta_thenEqual() {
        float square = 2 * 2;
        float rectangle = 3 * 2;
        float delta = 2;

        assertEquals(square, rectangle, delta);
    }

    @Test
    void whenAssertingConditions_thenVerified() {
        assertTrue(5 > 4, "5 is greater the 4");
        assertTrue(null == null, "null is equal to null");
    }

    @Test
    public void givenBooleanSupplier_whenAssertingCondition_thenVerified() {
        assertFalse(5 > 6, "5 is not greater then 6");
    }

    @Test
    void whenAssertingNotNull_thenTrue() {
        Object dog = new Object();

        assertNotNull(dog, "The dog should not be null");
    }

    @Test
    public void whenAssertingNull_thenTrue() {
        Object cat = null;

        assertNull(cat, "The cat should be null");
    }

    @Test
    public void whenAssertingSameObject_thenSuccessfull() {
        String language = "Java";
        String anotherLanguage = "JavaScript";

        assertNotSame(language, anotherLanguage);
    }

    @Test
    public void whenFailingATest_thenFailed() {
        // Test not completed
        fail("FAIL - test not completed");
    }

    @Test
    void givenMultipleAssertion_whenAssertingAll_thenOK() {
        Object obj = null;
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> assertEquals("java", "JAVA".toLowerCase()),
                () -> assertNull(obj, "obj is null")
        );
    }

    @Test
    void givenTwoLists_whenAssertingIterables_thenEquals() {
        Iterable<String> al = new ArrayList<>(asList("Java", "Junit", "Test"));
        Iterable<String> ll = new LinkedList<>(asList("Java", "Junit", "Test"));

        assertIterableEquals(al, ll);
    }

    @Test
    void whenAssertingEqualityListOfStrings_thenEqual() {
        List<String> expected = asList("Java", "\\d+", "JUnit");
        List<String> actual = asList("Java", "11", "JUnit");

        assertLinesMatch(expected, actual);
    }

    @Test
    void whenAssertingEquality_thenNotEqual() {
        Integer value = 5;

        assertNotEquals(0, value, "The result cannot be 0");
    }

    @Test
    void whenAssertingException_thenThrown() {
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                }
        );
        assertEquals("Exception message", exception.getMessage());
    }

    @Test
    void whenAssertingTimeout_thenNotExceeded() {
        assertTimeoutPreemptively(
                ofSeconds(2),
                () -> {
                    Thread.sleep(1000);
                }
        );
    }
}
