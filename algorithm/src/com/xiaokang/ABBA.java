package com.xiaokang;


public class ABBA {
    /*
0)
"B"
"ABBA"
Returns: "Possible"
Jamie can perform the following moves:
Initially, the string is "B".
Jamie adds an 'A' to the end of the string. Now the string is "BA".
Jamie reverses the string and then adds a 'B' to the end of the string. Now the string is "ABB".
Jamie adds an 'A' to the end of the string. Now the string is "ABBA".
Since there is a sequence of moves which starts with "B" and creates the string "ABBA", the answer is "Possible".
1)
"AB"
"ABB"
Returns: "Impossible"
The only strings of length 3 Jamie can create are "ABA" and "BAB".
2)
"BBAB"
"ABABABABB"
Returns: "Impossible"
3)
"BBBBABABBBBBBA"
"BBBBABABBABBBBBBABABBBBBBBBABAABBBAA"
Returns: "Possible"
4)
"A"
"BB"
Returns: "Impossible"
     */
    public String canObtain(String initial, String target){

        String intermediateTarget= target;
        while(intermediateTarget.length()>initial.length()){
            if (intermediateTarget.charAt(intermediateTarget.length()-1)=='A'){
                intermediateTarget = intermediateTarget.substring(0,intermediateTarget.length()-1);
            }else{
                intermediateTarget = reserveString(intermediateTarget.substring(0,intermediateTarget.length()-1));
            }
        }

        return  initial.equalsIgnoreCase(intermediateTarget)?"Possible":"Impossible";
    }

    public String reserveString(String input){
        StringBuilder s= new StringBuilder();

        for(int i=input.length()-1;i>=0;i--){
            s.append(input.charAt(i));
        }

        return s.toString();
    }
}
