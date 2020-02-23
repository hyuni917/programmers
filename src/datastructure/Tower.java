package datastructure;

import java.util.Stack;

public class Tower {

    public static void main(String[] args){
        int numbers[] = {6,9,5,7,4};
        Tower t= new Tower();
        t.solution(numbers);
    }

    public int[] solution(int[] heights) {
        int heightsSize = heights.length;
        int[] answer = new int[heightsSize];

        Stack<Integer> stack = new Stack<>();
        for(int height : heights){
            stack.push(height);
        }
        //System.out.println("heightsSize="+heightsSize);
        int cnt = 1;
        do{
            int sender = stack.pop();

            //System.out.println("sender="+sender);
            for(int i=heightsSize-cnt; i>=0; i--){
                if(heights[i]>sender){
                    //System.out.println("i="+i);
                    //System.out.println(heights[i]);
                    answer[heightsSize-cnt] = i+1;
                    break;
                }
            }
            cnt++;
            //System.out.println("stack.size()="+stack.size());
        }while(!stack.empty());

        return answer;
    }
}
