package pekan7_2511533005;

public class BubleSort_2511533005 {
	public static void bubbleSort_2511533005 (int [] arr) {
		int n_3005 = arr.length;
		for (int i_3005 = 0; i_3005 < n_3005; i_3005++) {
			for (int j_3005 = 0; j_3005 < n_3005 - i_3005 - 1; j_3005++) {
				if (arr[j_3005] > arr[j_3005 + 1]) {
					int temp_3005 = arr[j_3005];
					arr[j_3005] = arr[j_3005 + 1];
					arr[j_3005 + 1] = temp_3005;
					// System.out.println("data:"+arr[j_3005]+" "+arr[j_3005+1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr_3005[] = {23, 78, 48, 8, 32, 56, 1 };
		int n_3005 = arr_3005.length;
		System.out.print("array yang belum terurut:");
		for (int i_3005 = 0; i_3005 < n_3005; i_3005++)
			System.out.print(arr_3005[i_3005]+ " ");
		System.out.println("");
		bubbleSort_2511533005(arr_3005);
		System.out.print("array yang terurut menggunakan BubleSort:");
		for (int i_3005 = 0; i_3005 < n_3005; i_3005++)
			System.out.print(arr_3005[i_3005] + " ");
		System.out.println("");

	}

}
