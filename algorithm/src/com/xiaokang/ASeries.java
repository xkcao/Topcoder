package com.xiaokang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ASeries {
    /*
0)
{3,8,4,5,6,2,2}
Returns: 5
No arithmetic series using these values is longer than 2,3,4,5,6.
1)
{-1,-5,1,3}
Returns: 3
-1, 1, 3 is an arithmetic series (so is 3,-1,-5).
2)
{-10,-20,-10,-10}
Returns: 3
-10,-10,-10 is an arithmetic series.
     */
    public  int longest(int[] values){
        List<Integer> listInput = new ArrayList<>();
        for(int i:values){
            listInput.add(i);
        }
        Collections.sort(listInput);
        List<Integer> listSeriesSize = new ArrayList<>();

        for(int i=0;i<listInput.size();i++){
            for(int j=i+1;j<listInput.size();j++){
                int size = 2;
                int diff = listInput.get(j) - listInput.get(i);

                int previous = listInput.get(j);

                for(int k=j+1;k<listInput.size();k++){
                    if(diff == listInput.get(k)-previous){
                        size ++;
                        previous = listInput.get(k);
                    }
                }

                listSeriesSize.add(size);
            }
        }

        Collections.sort(listSeriesSize);

        return listSeriesSize.get(listSeriesSize.size()-1);
    }
}
