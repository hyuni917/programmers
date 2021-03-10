package algorithm;

/**
 * 퀵 정렬(Quick Sort) 리스트 가운데서 하나의 원소를 고름(pivot 선정)
 * pivot 앞에는 pivot보다 작은 값이 오고,
 * pivot 뒤에는 pivot보다 큰 값들이 오도록 리스트를 둘로 분할한다.
 * 분할된 두 개의 리스트에 대해 재귀함수를 통해 이 과정을 반복한다.
 * 시간복잡도 : 최악 O(n^2), 평균 O(n log n)
 *
 */
public class Quick {

	public void sort(int[] data, int l, int r) {
		int left = l;
		int right = r;
		int pivot = data[(l + r) / 2];

		do {
			while (data[left] < pivot)
				left++;
			while (data[right] > pivot)
				right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);

		if (l < right)
			sort(data, l, right);
		if (r > left)
			sort(data, left, r);
	}

	public static void main(String[] args) {

		int data[] = { 66, 10, 1, 34, 5, -10 };

		Quick quick = new Quick();
		quick.sort(data, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] : " + data[i]);
		}
	}

}
