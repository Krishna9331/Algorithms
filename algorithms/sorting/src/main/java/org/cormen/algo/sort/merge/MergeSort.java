package org.cormen.algo.sort.merge;

import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Created by mishrk3 on 5/7/2015.
 */
public class MergeSort {

    public int[] mergeSortAsc(int[] elements) {

        int startIndex = 0;
        int lastIndex = elements.length - 1;

        mergeSort(elements, startIndex, lastIndex);

        return elements;
    }

    /**
     *
     * @param elements integer array
     * @param p starting index
     * @param r last index
     *          This method is recursively called twice for dividing the A[0...n] to A[0...n/2] and A[n/2+1...n]
     *          and sort them recursively again.
     *
     *          once that is done it call merge operation for each of the division.
     */
    private void mergeSort(int[] elements, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(elements, p, q);
            mergeSort(elements, q + 1, r);
            merge(elements, p, q, r);
        }
    }

    /**
     *
     * @param elements array of integer
     * @param p indices
     * @param q indices
     * @param r indices
     *
     *          All the indices holds relationship p <= q < r.
     *          This method assume that A[p...q] and A[q+1...r] is already sorted and it has to merge it.
     *
     */
    private void merge(int[] elements, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];
        //created temp array to store all left element A[p...q]
        for (int i = 0; i < n1; i++) {
            left[i] = elements[p + i];
        }
        //Sentinel for an integer
        Double infinity = POSITIVE_INFINITY;
        left[n1] = infinity.intValue();

        //Do the same for the right one A[q+1...r]
        for (int j = 0; j < n2; j++) {
            right[j] = elements[q + j + 1];
        }
        right[n2] = infinity.intValue();

        /**
         * This is the actual loop which is doing the mixing of the pile in sorted order by
         * taking smallest from top between two.
         *
         * The loop invariant here is The sub array A[p...k-1] contains k-p smallest element of the L[1...n1 +1]
         * and R[1...n2+1] in sorted order.
         */
        for (int i = 0, j = 0, k = p; k <= r; k++) {
            if (left[i] <= right[j]) {
                elements[k] = left[i];
                i++;
            } else {
                elements[k] = right[j];
                j++;
            }
        }
    }
}
