package org.cormen.algo.insertion;

public class InsertionSort {
	
	public int [] sort(int [] elements){
		
		int j = 0;
		
		for(j = 1;j< elements.length; j++){
			int key = elements[j];
			int i = j-1;
			while(i>=0 && elements[i] >= key){
				elements[i+1] = elements[i];
				i = i-1;
				elements[i+1] = key;
			}
		}
		
		return elements;
		
	}

}
