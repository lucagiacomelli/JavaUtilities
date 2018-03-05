package sorting;



/**
 * @author lucagiacomelli
 * The Insertion Sort algorithm in JAVA
 * 
 * Cost of the implementation:
 * - Insertion:
 * - Search:
 * - Sorting:
 * 
 */
public class InsertionSort {
	
	
    public static int[] sort(int n, int[] arr) {
        int elem = arr[n-1];
        if (n > 1){
            int i= n-2;
            while (i>=0){
                if (arr[i] <= elem){
                    arr[i+1] = elem;
                    break;
                }
                else{
                    arr[i+1] = arr[i];
                }
                i--;
            }
            if (i == -1)
                arr[0] = elem; 
        }
        return arr;
    }
}
