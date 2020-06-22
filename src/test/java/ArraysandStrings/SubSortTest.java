package ArraysandStrings;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubSortTest {
    static SubSort ss;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Set of test for SubSort array problem.");
        //Setup class for testing
        ss = new SubSort();
    }

    @Test
    public void findUnsortedSequenceTest1() {
        System.out.println("Test 1");
        int[] input = {1, 2, 3, 4, 5, 6,8, 7, 60};
        assertEquals("6 7", ss.findUnsortedSequence(input));
    }

    @Test
    public void findUnsortedSequenceTest2() {
        System.out.println("Test 2");
        int[] input = {1, 2, 6, 60, 5, 3,8, 7, 4};
        assertEquals("2 8", ss.findUnsortedSequence(input));
    }

    @Test
    public void findUnsortedSequenceTest3() {
        System.out.println("Test 3");
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        assertEquals("0 9", ss.findUnsortedSequence(input));
    }

    @Test
    public void findUnsortedSequenceTest4() {
        System.out.println("Test 4");
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        assertEquals("", ss.findUnsortedSequence(input));
    }

    @Test
    public void findUnsortedSequenceTest5() {
        System.out.println("Test 5");
        int[] input = {1, 2, 3, 4, 8, 7, 6, 5, 9, 10};
        assertEquals("4 7", ss.findUnsortedSequence(input));
    }
}