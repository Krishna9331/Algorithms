package org.cormen.algo.merge;

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

    private void mergeSort(int[] elements, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(elements, p, q);
            mergeSort(elements, q + 1, r);
            merge(elements, p, q, r);
        }
    }

    private void merge(int[] elements, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            left[i] = elements[p + i];
        }
        Double infinity = POSITIVE_INFINITY;
        left[n1] = infinity.intValue();

        for (int j = 0; j < n2; j++) {
            right[j] = elements[q + j + 1];
        }
        right[n2] = infinity.intValue();
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
