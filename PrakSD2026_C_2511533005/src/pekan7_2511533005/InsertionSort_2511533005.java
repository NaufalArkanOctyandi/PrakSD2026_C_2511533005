package pekan7_2511533005;

public class InsertionSort_2511533005 {
	public static void insertionSort_2511533005 (int[] arr) {
		int n_3005 = arr.length;
		for (int i_3005 = 1; i_3005 < n_3005; i_3005++) {
			int key_3005 = arr[i_3005];
			int j_3005 = i_3005 - 1;
			while (j_3005 >=0 && arr[j_3005] > key_3005) {
				arr[j_3005 + 1] = arr[j_3005];
				j_3005--;
			}
			arr[j_3005 + 1] = key_3005;
		}
	}
	public static void main(String[] args) {
		int arr_3005[] = {23, 78, 45, 8, 32, 56, 1 };
		int n_3005 = arr_3005.length;
		System.out.printf("Array yang belum terurut:\n");
		for (int i_3005 = 0; i_3005 < n_3005; i_3005++) 
			System.out.print(arr_3005[i_3005] + " ");
		System.out.println("");
		insertionSort_2511533005(arr_3005);
		System.out.printf("Array yang terurut:\n");
		for (int i_3005 = 0; i_3005 < n_3005; i_3005++)
			System.out.print(arr_3005[i_3005] + " ");
		System.out.println("");

	}

}
