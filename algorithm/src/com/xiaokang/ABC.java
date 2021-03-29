package com.xiaokang;

public class ABC {
    /*
0)
3
3
Returns: "ABC"
This string has exactly three pairs (i, j) mentioned in the statement: (0, 1), (0, 2) and (1, 2).
1)
3
0
Returns: "CBA"
Please note that there are valid test cases with K = 0.
2)
5
10
Returns: ""
Five characters is too short for this value of K.
3)
15
36
Returns: "CABBACCBAABCBBB"
     */

    static class Combination{
        int a;
        int b;
        int c;
    }

    public String createString(int N, int K){
        Combination combination = getCombination(N,K);
        if(combination==null) return "";

        int aNum = combination.a;
        int bNum = combination.b;
        int cNum = combination.c;

        StringBuilder s = new StringBuilder();

        s.append("A".repeat(Math.max(0, aNum)));
        s.append("B".repeat(Math.max(0, bNum)));
        s.append("C".repeat(Math.max(0, cNum)));

        while (getNumberOfPairs(s.toString())>K){
            reduce1Pair(s);
        }

        return s.toString();
    }

    Combination getCombination(int N, int K){
        Combination combination = new Combination();

        int aNum;
        int bNum;
        int cNum;
        for(int a=0;a<N;a++){
            for(int b=0;b<N-a;b++){
                int c = N - a - b;
                int pairNum = a * b + a * c + b * c;
                if(pairNum >=K){
                    combination.a = a;
                    combination.b = b;
                    combination.c = c;

                    return combination;
                }
            }
        }

        return null;
    }

    int getNumberOfPairs(String s){
        int num=0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                char b=s.charAt(j);

                if (a<b) num++;
            }
        }

        return num;
    }

    void reduce1Pair(StringBuilder s){
        char charC = 'C';

        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)==charC){
                char previousChar = s.charAt(i-1);
                if(previousChar < charC){
                    s.setCharAt(i-1,charC) ;
                    s.setCharAt(i,previousChar);

                    return;
                }
            }
        }

        char charB =  'B';
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)==charB){
                char previousChar = s.charAt(i-1);
                if(previousChar < charB){
                    s.setCharAt(i-1,charB) ;
                    s.setCharAt(i,previousChar);

                    return;
                }
            }
        }
    }
}
