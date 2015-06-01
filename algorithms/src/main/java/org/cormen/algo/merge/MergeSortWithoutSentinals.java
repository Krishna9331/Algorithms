package org.cormen.algo.merge;

/**
 * Created by mishrk3 on 6/1/2015.
 */
public class MergeSortWithoutSentinals {
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

        for (int j = 0; j < n2; j++) {
            right[j] = elements[q + j + 1];
        }
        for (int i = 0, j = 0, k = p; k <= r; k++) {
            if (i != n1 && j != n2) {
                if (left[i] <= right[j]) {
                    elements[k] = left[i];
                    i++;
                } else {
                    elements[k] = right[j];
                    j++;
                }
            }else{
                if(i== n1){
                    elements[k] = right[j];
                }else{
                    elements[k] = left[i];
                }
            }
        }
    }
}
