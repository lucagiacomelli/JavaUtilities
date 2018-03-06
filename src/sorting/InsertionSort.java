package sorting;



/**
 * @author lucagiacomelli
 * The Insertion Sort algorithm in JAVA
 * 
 * Cost of the implementation:
 * - Insertion: O(n)
 * - Time sorting: O(n^2)
 * - Space Sorting: O(n) + O(1) auxiliary variable
 * 
 */
public class InsertionSort {
	
	
    public static int[] sort(int n, int[] arr) {
    	for (int j=1; j< n; j++){
            int elem = arr[j];
            int i = j-1;
            while (i>=0){
                if (arr[i] <= elem){
                    arr[i+1] = elem;
                    break;
                }
                else
                    arr[i+1] = arr[i];
                i--;
            }
            if (i == -1)
                arr[0] = elem; 
        }
    	return arr;
    }
}
