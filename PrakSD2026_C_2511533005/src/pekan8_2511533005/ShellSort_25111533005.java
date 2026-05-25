package pekan8_2511533005;

public class ShellSort_25111533005 {
	public static void shellSort_2511533005(int [] A_3005) {
		int n_3005 = A_3005.length;
		int gap_3005 = n_3005 / 2;
		while (gap_3005 > 0) {
			for (int i_3005 = gap_3005; i_3005 < n_3005; i_3005++) {
				int temp_3005 = A_3005[i_3005];
				int j_3005 = i_3005;
				while (j_3005 >= gap_3005 && A_3005[j_3005 - gap_3005]> temp_3005) {
					A_3005[j_3005] = A_3005[j_3005 - gap_3005];
					j_3005 = j_3005-gap_3005;
				}
				A_3005[j_3005] = temp_3005;
			}
			gap_3005 = gap_3005 / 2;
		}
	}
	public static void main (String[] args) {
		int[] data_3005 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray(data_3005);
		
		shellSort_2511533005(data_3005);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data_3005);
	}
	public static void printArray(int[] arr) {
		for (int i_3005 : arr) System.out.print(i_3005 + " ");
		System.out.println();
	}

}
