package org.cormen.algo.sort.merge;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

/**
 * Created by mishrk3 on 6/1/2015.
 */
public class MergeSortWithoutSentinalsTest {

    Logger logger = LoggerFactory.getLogger(MergeSortWithoutSentinalsTest.class);

    @Test
    public void testMergeSortAsc() {

        MergeSortWithoutSentinals ms = new MergeSortWithoutSentinals();

        int[] elements = {5, 2, 4, 7, 1, 3, 2, 6};
        logger.info("Testing Ascending order using Insertion Sort for {}", elements);
        int[] sortedElements = ms.mergeSortAsc(elements);
        test(sortedElements);
        print(sortedElements);

        int[] ele = {31, 41, 59, 26, 41, 58};
        logger.info("Testing Ascending order using Insertion Sort for {}", ele);
        int[] sortedEle = ms.mergeSortAsc(ele);
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
