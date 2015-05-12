package org.cormen.algo.insertion;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class InsertionSortTest {

    Logger logger = LoggerFactory.getLogger(InsertionSortTest.class);

    @Test
    public void testSortAsc() {
        InsertionSort is = new InsertionSort();
        int[] elements = {5, 2, 4, 6, 1, 3};
        logger.info("Testing Ascending order using Insertion Sort for {}", elements);
        int[] sortedElements = is.sortAsc(elements);
        test(sortedElements);
        print(sortedElements);

        int[] ele = {31, 41, 59, 26, 41, 58};
        logger.info("Testing Ascending order using Insertion Sort for {}", ele);
        int[] sortedEle = is.sortAsc(ele);
        test(sortedEle);
        print(sortedEle);
    }

    @Test
    public void testSortDesc() {
        InsertionSort is = new InsertionSort();
        int[] elements = {5, 2, 4, 6, 1, 3};
        logger.info("Testing Descending order using Insertion Sort for {}", elements);
        int[] sortedElements = is.sortDesc(elements);
        testDesc(sortedElements);
        print(sortedElements);

        int[] ele = {31, 41, 59, 26, 41, 58};
        logger.info("Testing Descending order using Insertion Sort for {}", ele);
        int[] sortedEle = is.sortDesc(ele);
        testDesc(sortedEle);
        print(sortedEle);
    }

    private void print(int[] sortedElements) {
        logger.info("Array after sorting: {}", sortedElements);
    }

    private void test(int[] sortedElements) {
        for (int i = 0; i < sortedElements.length - 1; i++) {
            logger.info("Doing comparison over elements {} and {}", sortedElements[i], sortedElements[i + 1]);
            assertTrue(sortedElements[i] <= sortedElements[i + 1]);
        }
        logger.info("Test passed...");
    }

    private void testDesc(int[] sortedElements) {
        for (int i = 0; i < sortedElements.length - 1; i++) {
            logger.info("Doing comparison over elements {} and {}", sortedElements[i], sortedElements[i + 1]);
            assertTrue(sortedElements[i] >= sortedElements[i + 1]);
        }
        logger.info("Test passed...");
    }
}
