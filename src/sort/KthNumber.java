package sort;

public class KthNumber {

    public static void main(String[] args){
        int array[] = {1, 5, 2, 6, 3, 7, 4};
        int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNumber p = new KthNumber();
        p.solution(array,commands);
    }

    public int[] solution(int[] array, int[][] commands) {
        int cnt = 0;
        int[] answer = new int[commands.length];
        for(int[] command : commands){
            int numberList[] =  getNumberList(array,command);
            sort(numberList,0,numberList.length-1);

            int k = command[2];
            System.out.println(numberList[k-1]);
            answer[cnt] = numberList[k-1];
            cnt++;

        }
        return answer;
    }

    /**
     * array 와 command 입력받아 정렬대상 추출
     * @param array
     * @param command
     * @return
     */
    public int[] getNumberList(int[] array, int[] command){
        int[] result = {};
        if(command.length == 3){
            int cnt = 0;
            int i = command[0]<command[1]?command[0]:command[1];
            int j = command[0]>command[1]?command[0]:command[1];
            //System.out.println((j-i)+1);
            result = new int[(j-i)+1];
            while (i <= j){
                //System.out.println(array[i-1]);
                result[cnt] = array[i-1];
                cnt++;
                i++;
            }
        }
        return result;
    }

    /**
     * 퀵정렬
     */
    public void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);

        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
}
