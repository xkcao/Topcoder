package com.xiaokang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbsSequence {
    /*
0)
"21"
"12"
{"0", "1", "2", "3", "4"}
Returns: {"21", "12", "9", "3", "6" }
Here S0=21 and S1=12. The next three sequence elements are S2 = |21 - 12| = 9, S3 = |12 - 9| = 3 and S4 = |9 - 3| = 6.
1)
"0"
"0"
{"1000000000000000000"}
Returns: {"0" }
Here we get the sequence consisting of only zeros.
2)
"823"
"470"
{"3","1","31","0","8","29","57","75","8","77"}
Returns: {"117", "470", "2", "823", "115", "87", "49", "25", "115", "23" }
3)
"710370"
"177300"
{"5","95","164721","418","3387","710","0","1197","19507","5848"}
Returns: {"178470", "108270", "90", "0", "90", "90", "710370", "90", "0", "0" }
     */
    public  String[] getElements(String first, String second, String[] indices){
        List<String> output = new ArrayList<>();
        Map<Long,Long> indexToValue = new HashMap<>();

        long firstValue = Long.parseLong(first);
        long secondValue = Long.parseLong(second);
        indexToValue.put(0L,firstValue);
        indexToValue.put(1L,secondValue);

        long i=2;
        long nextValue;
        while((nextValue=Math.abs(firstValue-secondValue))!=0){
            indexToValue.put(i,nextValue);

            firstValue = secondValue;
            secondValue = nextValue;
            i++;
        }
        long repeatingValue=firstValue;

        for(String index:indices){
            String valueStr = Long.toString(getValue(indexToValue,Long.parseLong(index),repeatingValue));
            output.add(valueStr);
        }

        return  output.toArray(new String[0]);
    }

    long getValue(Map<Long,Long> indexToValue, long index, long repeatingValue){
        Long value = indexToValue.get(index);
        if(value != null){
            return value;
        }

        if((index-indexToValue.size())%3==0)
            return 0;
        else
            return repeatingValue;
    }
}
