package sort;

public class BigNumber {

    public static void main(String[] args){
        int numbers[] = {0, 0, 0};
        BigNumber b= new BigNumber();
        b.solution(numbers);
    }

    public String solution(int[] numbers) {
        String answer = "";
        sort(numbers,0,numbers.length-1);

        for(int i = numbers.length-1; i>=0; i--){
            if(!answer.equals("0")){
                answer += numbers[i];
            }
        }

        System.out.println("answer="+answer);
        return answer;
    }

    /**
     * 퀵정렬
     */
    public void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        do{
            while(maxNumber(data[left]) < maxNumber(pivot)) left++;
            while(maxNumber(data[right]) > maxNumber(pivot)) right--;
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

    public double maxNumber(int data){
        double result = 0;
        int length = (int)(Math.log10(data)+1);
        //System.out.println("data="+data);
        //System.out.println("length="+length);

        switch (length){
            case 1 : result =  data*1111;
            break;
            case 2 : result = (data*100)+data;
            break;
            case 3 : result = (data*10)+((data*10)/1000);
            break;
            case 4 : result = data*1;
            break;
        }

        System.out.println("result="+result);
        return result;
    }


}
