package org.cormen.algo.sort.insertion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mishrk3 on 6/1/2015.
 */
public class RecursiveInsertionSort {

    Logger logger = LoggerFactory.getLogger(RecursiveInsertionSort.class);

    public int [] sortAscRecursive(int [] elements){
        int startIndex = 0;
        int lastIndex = elements.length -1;
        insertionSort(elements, startIndex, lastIndex);
        return elements;
    }

    private void insertionSort(int[] elements, int p, int q) {
        if(p < q){
            int r = q - p - 1;
            insertionSort(elements, p, r);
            insert(elements, r, q);
        }
    }

    private void insert(int[] elements, int p, int q) {
        int key = elements[q];
        for (int i = p; i >= 0; i--) {
            if(key < elements[i]){
                elements[i + 1] = elements[i];
                elements[i] = key;
            }else{
                break;
            }
        }
    }
}
