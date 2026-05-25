package pekan8_2511533005;

public class MergeSort_2511533005 {
	void merge_2511533005(int arr[], int l_3005, int m_3005, int r_3005) {
		// Find sizes of two subarrays to be merged
		int n1_3005 = m_3005 - l_3005 + 1;
		int n2_3005 = r_3005 - m_3005;
		/* create temp arrays */
		int L_3005[] = new int[n1_3005];
		int R_3005[] = new int[n2_3005];
		/* copy data to temp arrays */
		for (int i_3005 = 0; i_3005 < n1_3005; ++i_3005) 
			L_3005[i_3005] = arr[l_3005 + i_3005];
		for (int j_3005 = 0; j_3005 < n2_3005; ++j_3005) 
			R_3005[j_3005] = arr[m_3005 + 1 + j_3005];
		int  i_3005 = 0, j_3005 = 0;
		// Initial index of merged subarray array
		int k_3005 = l_3005;
		while (i_3005 < n1_3005 && j_3005 <n2_3005) {
			if (L_3005[i_3005] <= R_3005[j_3005]) {
				arr[k_3005] = L_3005[i_3005];
				i_3005++;
			} else {
				arr[k_3005] = R_3005[j_3005];
				j_3005++;
			}
			k_3005++;
		}
		/* copy remaining element of L[] if any */
		while (i_3005 < n1_3005) {
			arr[k_3005] = L_3005[i_3005];
			i_3005++;
			k_3005++;
		}
		/* copy remaining elements of R[] if any */
		while (j_3005 < n2_3005) {
			arr[k_3005] = R_3005[j_3005];
			j_3005++;
			k_3005++;
		}
 	}
	void sort_2511533005 (int arr_3005[], int l_3005, int r_3005) {
		if (l_3005 < r_3005) {
			// find the middle point 
			int m_3005 = (l_3005 + r_3005) / 2;
			//Sort first and second halves
			sort_2511533005(arr_3005, l_3005, m_3005);
			sort_2511533005(arr_3005, m_3005 + 1, r_3005);
			//merge the sorted halves
			merge_2511533005(arr_3005, l_3005, m_3005, r_3005);
		}
	}
	/* A utility function to print array of size n */
	static void printArray_2511533005 (int arr_3005[]) {
		int n_3005 = arr_3005.length;
		for (int i_3005 = 0; i_3005 < n_3005; ++i_3005) {
			System.out.print(arr_3005[i_3005] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr_3005[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum terurut");
		printArray_2511533005(arr_3005);
		MergeSort_2511533005 ob_3005 = new MergeSort_2511533005();
		ob_3005.sort_2511533005(arr_3005, 0, arr_3005.length - 1);
		System.out.println("\nSesudah terurut menggunakan merge sort");
		printArray_2511533005(arr_3005);

	}

}
