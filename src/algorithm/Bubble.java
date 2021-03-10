package algorithm;

/**
 * 버블 정렬(Bubble Sort)
 * 세번의 회전에 걸쳐 정렬은 완료되었지만 프로그램은 남은 데이터의 비교연산을 계속 처리함.
 * 정렬은 비교연산을 통해 가장 큰 데이터 부터 끝에 정렬됨.
 * 버블 정렬의 장점
 * - 구현이 쉽다.
 * - 이미 정렬된 데이터를 정렬할때 가장 빠르다.
 * 버블 정렬의 단점
 * - 다른 정렬에 비해 정렬 속도가 느리다.
 * - 역순배열을 정렬할때 가장 느리다.
 */
public class Bubble {

	public void sort(int[] data) {
		int temp = 0;
		for (int i = data.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Bubble bubble = new Bubble();

		int data[] = { 66, 10, 1, 34, 5 };

		bubble.sort(data);

		for (int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] : " + data[i]);
		}
	}

}
