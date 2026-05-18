package pekan7_2511533005;

public class selectionSort_2511533005 {
	public static void selectionSort_2511533005(int[] arr) {
		int n_3005 = arr.length;
		for (int i_3005 = 0; i_3005 < n_3005; i_3005++) {
			int minIndex_3005 = i_3005;
			for(int j_3005 = i_3005 + 1; j_3005 < n_3005; j_3005++) {
				if(arr[j_3005] < arr[minIndex_3005]) {
					minIndex_3005 = j_3005;
				}
			}
			int temp_3005 = arr[i_3005];
			arr[i_3005] = arr[minIndex_3005];
			arr[minIndex_3005] = temp_3005;
		}
	}
	public static void main(String[] args) {
		int arr_3005[] = {23, 78, 48, 8, 32, 56, 1 };
		int n_3005 = arr_3005.length;
		System.out.printf("array yang belum terurut:\n");
		for(int i_3005 = 0; i_3005 < n_3005; i_3005++)
			System.out.print(arr_3005[i_3005] + " ");
		System.out.println("");
		selectionSort_2511533005(arr_3005);
		System.out.printf("array yang terurut:\n");
		for(int i_3005 = 0; i_3005 < n_3005; i_3005++)
			System.out.print(arr_3005[i_3005] + " ");
		System.out.println("");
	}

}
