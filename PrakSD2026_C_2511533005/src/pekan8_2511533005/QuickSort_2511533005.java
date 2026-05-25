package pekan8_2511533005;

public class QuickSort_2511533005 {
	static void swap (int[] arr, int i_3005, int j_3005) {
		int temp_3005 = arr[i_3005];
		arr[i_3005] = arr[j_3005];
		arr[j_3005] = temp_3005;
	}
	//metode tambahan untuk mengatur pivot menggunakan median-of-three
	static void medianOfThree_2511533005(int[] arr, int low_3005, int high_3005) {
		int mid_3005 = low_3005 + (high_3005 - low_3005) / 2;
		
		// urutkan elemen low, mid, dan high
		if (arr[low_3005] > arr[mid_3005]) {
			swap(arr, low_3005, mid_3005);
		}
		if (arr[low_3005] > arr[mid_3005]) {
			swap(arr, low_3005, mid_3005);
		}
		if (arr[mid_3005] > arr[high_3005]) {
			swap(arr, mid_3005, high_3005);
		}
		swap(arr, mid_3005, high_3005);
	}
	static int partition_2511533005 (int[] arr, int low_3005, int high_3005) {
		//panggil fungsi medianOfThree sebelum menentukan pivot 
		medianOfThree_2511533005(arr, low_3005, high_3005);
		
		int pivot_3005 = arr[high_3005]; // Sekarang arr[high] sudah berisi nilai median 
		int i_3005 = (low_3005-1);
		
		for (int j_3005 = low_3005; j_3005<= high_3005 - 1; j_3005++) {
			// jika elemen saat ini lebih kecil dari atau sama dengan pivot 
			if (arr[j_3005] < pivot_3005) {
				// Increment indeks elemen yang lebih kecil
				i_3005++;
				swap(arr, i_3005, j_3005);
			}
		}
		swap(arr, i_3005 + 1, high_3005);
		return (i_3005 + 1);
	}
	static void quickSort_2511533005(int[] arr, int low_3005, int high_3005) {
		if (low_3005 <high_3005) {
			int pi_3005 = partition_2511533005(arr, low_3005, high_3005);
			quickSort_2511533005(arr, low_3005, pi_3005 - 1);
			quickSort_2511533005(arr, pi_3005 + 1, high_3005);
			
		}
	}
	public static void printArr_2511533005(int[] arr) {
		for (int i_3005=0; i_3005 < arr.length; i_3005++) {
			System.out.print(arr[i_3005] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr_3005 = {10, 7, 8, 9, 1, 5};
		int N_3005 = arr_3005.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2511533005(arr_3005);
		
		quickSort_2511533005(arr_3005, 0, N_3005 - 1);
		
		System.out.print("Data Terurut quickSort: ");
		printArr_2511533005(arr_3005);
	}

}
