package com.xiaokang;

import java.util.ArrayDeque;
import java.util.Deque;

public class ABBADiv1 {
    /*
0)
"A"
"BABA"
Returns: "Possible"
Jamie can perform the following moves:
Initially, the string is "A".
Jamie adds a 'B' to the end of the string and then reverses the string. Now the string is "BA".
Jamie adds a 'B' to the end of the string and then reverses the string. Now the string is "BAB".
Jamie adds an 'A' to the end of the string. Now the string is "BABA".
Since there is a sequence of moves which starts with "A" and creates the string "BABA", the answer is "Possible".
1)
"BAAAAABAA"
"BAABAAAAAB"
Returns: "Possible"
Jamie can add a 'B' to the end of the string and then reverse the string.
2)
"A"
"ABBA"
Returns: "Impossible"
3)
"AAABBAABB"
"BAABAAABAABAABBBAAAAAABBAABBBBBBBABB"
Returns: "Possible"
4)
"AAABAAABB"
"BAABAAABAABAABBBAAAAAABBAABBBBBBBABB"
Returns: "Impossible"
     */
    public  String canObtain(String initial, String target){

        Deque<String> targetQueue = new ArrayDeque();
        targetQueue.addLast(target);
        while (targetQueue.size()>0){
            String firstElement = targetQueue.removeFirst();
            if(firstElement.length()==initial.length() && initial.equalsIgnoreCase(firstElement)){
                return "Possible";
            }else if(firstElement.length()>initial.length()){
                if(firstElement.charAt(firstElement.length()-1)=='A'){
                    targetQueue.addLast(firstElement.substring(0,firstElement.length()-1));
                }

                if(firstElement.charAt(0)=='B'){
                    targetQueue.addLast(reverseString(firstElement.substring(1)));
                }
            }
        }

        return "Impossible";
    }

    public String reverseString(String input){
        StringBuilder s = new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){
            s.append(input.charAt(i));
        }

        return  s.toString();
    }
}
