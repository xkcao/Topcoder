package com.xiaokang;

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

        if(initial.length()==target.length()){
            return (initial.equalsIgnoreCase(target))?"Possible":"Impossible";
        }

        if (target.charAt(target.length()-1)=='A' && target.charAt(0)=='B'){
            if (canObtain(initial,target.substring(0,target.length()-1)).equalsIgnoreCase("Possible") ||
            canObtain(initial,reverseString(target.substring(1))).equalsIgnoreCase("Possible")){
                return  "Possible";
            }
        } else if (target.charAt(target.length()-1)=='A' &&
                canObtain(initial,target.substring(0,target.length()-1)).equalsIgnoreCase("Possible") ) {
            return "Possible";
        }else if(target.charAt(0)=='B' &&
                canObtain(initial,reverseString(target.substring(1))).equalsIgnoreCase("Possible")
        ){
            return "Possible";
        }
        else{
            return  "Impossible";
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
