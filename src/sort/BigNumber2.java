package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigNumber2 {

    public static void main(String[] args){
        int numbers[] = {321, 3213, 2};
        BigNumber2 b= new BigNumber2();
        b.solution(numbers);
    }

    public String solution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int number : numbers) {
            list.add(number);
        }
        Collections.sort(list, (a, b) -> {
            System.out.println("a="+a);
            System.out.println("b="+b);
            String as = String.valueOf(a), bs = String.valueOf(b);
            System.out.println("as="+as);
            System.out.println("bs="+bs);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        System.out.println(answer);
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }



}
