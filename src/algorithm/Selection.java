package algorithm;

/**
 * 선택 정렬(Selection Sort)
 * 주어진 데이터 중 최소값을 찾음
 * 최소값을 맨 앞에 위치한 값과 교환
 * 정렬된 데이터를 제외한 나머지 데이터를 같은 방법으로 정렬
 * 시간복잡도 : O(n^2)
 *
 */
public class Selection {

	public void sort(int[] data){
        int size = data.length;
        int min; //최소값을 가진 데이터의 인덱스 저장 변수
        int temp;

        for(int i=0; i<size-1; i++){ // size-1 : 마지막 요소는 자연스럽게 정렬됨
            min = i;
            for(int j=i+1; j<size; j++){
                if(data[min] > data[j]){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }
    public static void main(String[] args) {

        Selection selection = new Selection();

        int data[] = {66, 10, 1, 99, 5};

        selection.sort(data);

        for(int i=0; i<data.length; i++){
            System.out.println("data["+i+"] : " + data[i]);
        }
    }

}
