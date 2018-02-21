package sortingAlgos;

// O(n^2) complexity
public class InsertionSort {
	
	public static void insertionSort(int[] list){
		for(int i=1; i < list.length; i++){
			/** Insert list[i] into a sorted sublist list[0..i-1] so that
			list[0..i] is sorted. */
			int currElement = list[i];
			int k;
			for(k=i-1; k >= 0 && list[k] > currElement; k--){
				list[k+1] = list[k];
			}
			// Insert the current element into list[k + 1]
			list[k+1] = currElement;
		}
	}
	
	public static void main(String[] args){
		int[] lst = {2, 9, 5, 4, 8, 1, 6};
		InsertionSort.insertionSort(lst);
	}
}
