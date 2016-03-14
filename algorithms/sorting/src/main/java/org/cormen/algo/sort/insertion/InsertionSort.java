package org.cormen.algo.sort.insertion;

/**
 * The insertion sort starts from the second element(key) and travers till length of the array.
 * for every element(key) it compares the key from all the elements left of key and put it in sorted order.
 * During comparison it keeps pushing the element one index right if it is larger than key until it finds the
 * smaller one and at this point it insert the key. That is why it is known as insertion sort.
 *
 * The loop invariant for insertion sort is:
 * At every iteration of for loop, which is indexed by j, the sub array A[1, ... j-1] is always sorted.
 */

public class InsertionSort {


    /**
     *
     * @param elements Integer array
     * @return sorted array in ascending order
     */
    public int[] sortAsc(int[] elements) {
    //starting for 2nd element, index in java array starts from zero
        for (int j = 1; j < elements.length; j++) {
            int key = elements[j];
            int i = j - 1;
            //replacing the element until it finds element smaller than it
            while (i >= 0 && elements[i] >= key) {
                elements[i + 1] = elements[i];
                i = i - 1;
            }
            elements[i + 1] = key;
        }

        return elements;

    }

    /**
     *
     * @param elements Integer array
     * @return sorted array in descending order
     */
    public int[] sortDesc(int[] elements) {

        for (int j = 1; j < elements.length; j++) {
            int key = elements[j];
            int i = j - 1;
            while (i >= 0 && elements[i] <= key) {
                elements[i + 1] = elements[i];
                i = i - 1;
            }
            elements[i + 1] = key;
        }

        return elements;

    }

}
