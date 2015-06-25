package org.cormen.algo.sort.insertion;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by mishrk3 on 6/1/2015.
 */
public class RecursiveInsertionSortTest {
    Logger logger = LoggerFactory.getLogger(RecursiveInsertionSortTest.class);
    @Test
    public void testSortAsc() {
        RecursiveInsertionSort is = new RecursiveInsertionSort();
        int[] elements = {5, 2, 4, 6, 1, 3};
        logger.info("Testing Ascending order using Insertion Sort for {}", elements);
        int[] sortedElements = is.sortAscRecursive(elements);
        test(sortedElements);
        print(sortedElements);

        int[] ele = {31, 41, 59, 26, 41, 58};
        logger.info("Testing Ascending order using Insertion Sort for {}", ele);
        int[] sortedEle = is.sortAscRecursive(ele);
        test(sortedEle);
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
}
