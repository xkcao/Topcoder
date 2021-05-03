package com.xiaokang;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("JavaDoc")
public class AB {
    /*
0)
3
2
Returns: "ABB"
This string has exactly two pairs (i, j) mentioned in the statement: (0, 1) and (0, 2).
1)
2
0
Returns: "BA"
Please note that there are valid test cases with K = 0.
2)
5
8
Returns: ""
Five characters is too short for this value of K.
3)
10
12
Returns: "BAABBABAAB"
     */

    /**
     * create s String which meet the specified conditions. return empty String if it does not exist
     * @param N
     * @param K
     * @return the String meeting the specified conditions and input parameters
     */
    public  String createString(int N, int K){

        //find the smallest number of A needed
        int numberA = smallestNumberOfA(N,K);

        //return empty String if no number of A can meet the condition
        if (numberA==0) return "";

        //loop through numberA and gradually reduce the remaining number of pairs
        //create a list with the positions of A
        int remainingPairNum = K;
        List<Integer> positionAList = new ArrayList<>();
        for(int i=1;i<=numberA;i++){
            if(remainingPairNum>N-numberA) {
                positionAList.add(i-1);
                remainingPairNum-=N-numberA;
            }else{
                positionAList.add(N-numberA+i-1-remainingPairNum);
                break;
            }
        }

        StringBuilder result=new StringBuilder();
        //build base String will all B
        result.append("B".repeat(Math.max(0, N)));

        //replace char with A at the right positions
        for (Integer integer : positionAList) {
            result.setCharAt(integer, 'A');
        }

        //for all remaining A, leave them to the far right end
        if(positionAList.size()<numberA){
            for(int i=0;i<numberA-positionAList.size();i++){
                result.setCharAt(N-i,'A');
            }
        }

        return result.toString();
    }

    /**
     * find the smallest number of A needed to meet the conditions. return 0 if it does not exist
     * @param N
     * @param K
     * @return the smallest number of A or 0
     */
    public int smallestNumberOfA(int N, int K){
        int i;
        for(i=1;i<=N;i++){
            if(K<= i*(N-i)) break;
        }

        return (i>N)? 0 : i;
    }
}
