package com.xiaokang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substitute {
    public int getValue(String key, String code){
        Map<Character,Integer> keyIndexMap = new HashMap<>();

        int index=0;
        for(char c : key.toCharArray()){
            keyIndexMap.put(c,index++);
        }

        List<Character> mappedCode = new ArrayList<>();
        for(char c: code.toCharArray()){
            if (keyIndexMap.get(c) != null){
                mappedCode.add(c);
            }
        }

        int result=0;
        index=0;
        for (char c : mappedCode){
            result += ((keyIndexMap.get(c)+1)%10)*Math.pow(10,mappedCode.size()-index-1);
            index++;
        }

        return result;
    }
}
