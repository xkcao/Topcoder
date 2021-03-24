package com.xiaokang;

public class ABBAReplace {
    /*
0)
"AABABB"
6
0
0
Returns: 4
The example from the problem statement.
1)
""
0
4
7
Returns: 0
An empty string.
2)
"ABBABAABABBBABBBB"
17
0
0
Returns: 11
S = Sprefix.
3)
"AABAA"
17
47474747
1000000000
Returns: 10
The string you should generate is S = "AABAAABAAABBBAAAA". The sequence of values in the "state" variable during generation is as follows:

81038168
1862554801
143404438
831999255
766706948
1708690157
2010484002
1631167411
81620336
507504873
660822382
597739535
     */
    public  int countSteps(String Sprefix, int N, int seed, int threshold){
        int step=0;
        String S = getStringS(Sprefix,N,seed,threshold);

        String newS;
        while (!(newS=replaceABwithBA(S)).equalsIgnoreCase(S)){
            step++;
            S = newS;
        }

        return step;
    }

    public String getStringS(String Sprefix, int N, int seed, int threshold){
        long state = seed;
        String S = Sprefix;
        while (S.length() < N) {
            state = ((state * 1103515245 + 12345)) % ( (long)Math.pow(2,31));
            if (state<threshold) {
                S += 'A';
            }
            else {
                S += 'B';
            }
        }

        return  S;
    }

    public String replaceABwithBA(String input){

        return input.replaceAll("AB","BA");
    }
}
