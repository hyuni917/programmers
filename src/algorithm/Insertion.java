package algorithm;

/**
 * 삽입 정렬(Insertion Sort)
 * 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함.
 * 배열의 두 번째 데이터 부터 연산을 시작함.
 * 시간복잡도 : O(n^2)
 */
public class Insertion {

	public void sort(int[] A) {
		int size = A.length;
		int temp = 0;
		int j = 0;
		for (int i = 1; i < size; i++) {
			temp = A[i];
			for (j = i - 1; j >= 0 && temp < A[j]; j--) {
				A[j + 1] = A[j];
			}
			A[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insertion insertion = new Insertion();

		int A[] = { 66, 10, 1, 34, 5 };

		insertion.sort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println("A[" + i + "] : " + A[i]);
		}
	}

}
