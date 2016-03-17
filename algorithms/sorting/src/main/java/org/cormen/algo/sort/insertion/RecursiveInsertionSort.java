package org.cormen.algo.sort.insertion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by mishrk3 on 6/1/2015.
 */

/**
 * Below insertion sort is another way of implementing using Divide-and-conquer.
 * The code follow the principle: In order to sort A[1...n], we recursively sort A[1...n-1]and then insert A[n] into the
 * sorted array A[1...n-1]
 */
public class RecursiveInsertionSort {

    Logger logger = LoggerFactory.getLogger(RecursiveInsertionSort.class);

    /**
     *
     * @param elements integer array need to be sorted
     * @return sorted integer array
     */
    public int [] sortAscRecursive(int [] elements){
        int startIndex = 0;
        int lastIndex = elements.length -1;
        insertionSort(elements, startIndex, lastIndex);
        return elements;
    }

    /**
     *
     * @param elements integer array
     * @param p start index
     * @param q end index
     * This method removes the last element from the array and try to sort the remaining array using recursion
     */
    private void insertionSort(int[] elements, int p, int q) {
        if(p < q){
            int r = q - p - 1;
            insertionSort(elements, p, r);
            insert(elements, r, q);
        }
    }

    /**
     *
     * @param elements integer array
     * @param p index till the array is sorted
     * @param q index for which element has to be inserted the array
     *
     *          When this method is called we already have sorted array till 0 to p index and it insert the element at
     *          q index at the appropriate position in array [0...p]
     *
     *          First time the method will be called with [A, 0, 1] so it will insert A[1] into A[0] after comparison
     *          second call [A, 1, 2] it will insert A[2] into A[0...1]
     *          Third call [A, 2, 3] it will insert A[3] into A[0...2]
     *          and so on
     */

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
