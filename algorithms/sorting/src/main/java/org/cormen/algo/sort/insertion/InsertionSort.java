package org.cormen.algo.sort.insertion;

public class InsertionSort {

    public int[] sortAsc(int[] elements) {

        for (int j = 1; j < elements.length; j++) {
            int key = elements[j];
            int i = j - 1;
            while (i >= 0 && elements[i] >= key) {
                elements[i + 1] = elements[i];
                i = i - 1;
            }
            elements[i + 1] = key;
        }

        return elements;

    }

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
