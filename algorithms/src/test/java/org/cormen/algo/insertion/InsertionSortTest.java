package org.cormen.algo.insertion;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class InsertionSortTest {

    @Test
    public void testSort() {
        InsertionSort is = new InsertionSort();
        int[] elements = {5, 2, 4, 6, 1, 3};
        int[] sortedElements = is.sort(elements);
        for (int i = 0; i < sortedElements.length - 1; i++) {

            assertTrue(sortedElements[i] <= sortedElements[i + 1]);
        }
        System.out.println("Sorted Array is: ");
        for (int i = 0; i < sortedElements.length; i++) {
            System.out.print(sortedElements[i] +" ");
        }
    }
}
