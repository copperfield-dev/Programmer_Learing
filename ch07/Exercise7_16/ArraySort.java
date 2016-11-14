public class ArraySort {
	public static void main(String[] args) {
		int array[][] = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        
        sort(array);
        for (int i = 0; i < array.length; i++) 
            System.out.print(array[i][0] + ", " + array[i][1] + "\n"); 
	}

	public static void sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = m.length - 1; j > i; j--) {
				if (m[j][0] < m[j - 1][0]) {
					int temp;
					temp = m[j][0];
					m[j][0] = m[j - 1][0];
					m[j - 1][0] = temp;
					temp = m[j][1];
					m[j][1] = m[j - 1][1];
					m[j - 1][1] = temp;
				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = m.length - 1; j > i; j--) {
				if (m[j][0] == m[j - 1][0] && m[j][1] < m[j - 1][1]) {
					int temp;
					temp = m[j][0];
					m[j][0] = m[j - 1][0];
					m[j - 1][0] = temp;
					temp = m[j][1];
					m[j][1] = m[j - 1][1];
					m[j - 1][1] = temp;
				}
			}
		}
	}
}
