public class PubbleSort {
	public static void pubbleSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = list.length - 1; j > i; j--) {
				if (list[j] < list[j - 1]) {
					double temp;
					temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
				}
			}
		}
	}
}