package com.xiaokang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ABCPath {
    /*
0)
{ "ABE", "CFG", "BDH", "ABC" }
Returns: 4
This is the example from the problem statement.
1)
{ "A" }
Returns: 1
2)
{ "BCDEFGHIJKLMNOPQRSTUVWXYZ" }
Returns: 0
Paths must start with an 'A'.
3)
{ "C", "D", "B", "A" }
Returns: 2
4)
{ "KCBVNRXSPVEGUEUFCODMOAXZYWEEWNYAAXRBKGACSLKYRVRKIO", "DIMCZDMFLAKUUEPMPGRKXSUUDFYETKYQGQHNFFEXFPXNYEFYEX", "DMFRPZCBOWGGHYAPRMXKZPYCSLMWVGMINAVRYUHJKBBRONQEXX", "ORGCBHXWMTIKYNLFHYBVHLZFYRPOLLAMBOPMNODWZUBLSQSDZQ", "QQXUAIPSCEXZTTINEOFTJDAOBVLXZJLYOQREADUWWSRSSJXDBV", "PEDHBZOVMFQQDUCOWVXZELSEBAMBRIKBTJSVMLCAABHAQGBWRP", "FUSMGCSCDLYQNIXTSTPJGZKDIAZGHXIOVGAZHYTMIWAIKPMHTJ", "QMUEDLXSREWNSMEWWRAUBFANSTOOJGFECBIROYCQTVEYGWPMTU", "FFATSKGRQJRIQXGAPLTSXELIHXOPUXIDWZHWNYUMXQEOJIAJDH", "LPUTCFHYQIWIYCVOEYHGQGAYRBTRZINKBOJULGYCULRMEOAOFP", "YOBMTVIKVJOSGRLKTBHEJPKVYNLJQEWNWARPRMZLDPTAVFIDTE", "OOBFZFOXIOZFWNIMLKOTFHGKQAXFCRZHPMPKGZIDFNBGMEAXIJ", "VQQFYCNJDQGJPYBVGESDIAJOBOLFPAOVXKPOVODGPFIYGEWITS", "AGVBSRLBUYOULWGFOFFYAAONJTLUWRGTYWDIXDXTMDTUYESDPK", "AAJOYGCBYTMXQSYSPTBWCSVUMNPRGPOEAVVBGMNHBXCVIQQINJ", "SPEDOAHYIDYUJXGLWGVEBGQSNKCURWYDPNXBZCDKVNRVEMRRXC", "DVESXKXPJBPSJFSZTGTWGAGCXINUXTICUCWLIBCVYDYUPBUKTS", "LPOWAPFNDRJLBUZTHYVFHVUIPOMMPUZFYTVUVDQREFKVWBPQFS", "QEASCLDOHJFTWMUODRKVCOTMUJUNNUYXZEPRHYOPUIKNGXYGBF", "XQUPBSNYOXBPTLOYUJIHFUICVQNAWFMZAQZLTXKBPIAKXGBHXX" }
Returns: 19
5)
{ "EDCCBA", "EDCCBA" }
Returns: 3
6)
{ "AMNOPA", "ALEFQR", "KDABGS", "AJCHUT", "AAIWVA", "AZYXAA" }
Returns: 26
     */
    public  int length(String[] grid){

        List<Integer> aList = new ArrayList<>();

        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[i].length();j++){
                if (grid[i].charAt(j)=='A') aList.add(longestLengh(grid,i,j,'A'));
            }
        }

        return (aList.size()==0)? 0:Collections.max(aList);
    }

    int longestLengh (String[] grid, int i, int j, char c){
        List<Integer> nextCharList = new ArrayList<>();
        if(i-1>=0){
            if(j-1>=0 && grid[i-1].charAt(j-1) == c + 1) nextCharList.add(longestLengh(grid, i-1,j-1,grid[i-1].charAt(j-1)));
            if(grid[i-1].charAt(j) == c+1) nextCharList.add(longestLengh(grid,i-1,j,grid[i-1].charAt(j)));
            if(j+1<= grid[i].length()-1 && grid[i-1].charAt(j+1) == c+1) nextCharList.add(longestLengh(grid,i-1,j+1,grid[i-1].charAt(j+1)));
        }

        if(j-1>=0 && grid[i].charAt(j-1) == c+1) nextCharList.add(longestLengh(grid,i,j-1,grid[i].charAt(j-1)));
        if(j+1<=grid[i].length()-1 && grid[i].charAt(j+1) == c+1) nextCharList.add(longestLengh(grid, i,j+1,grid[i].charAt(j+1)));

        if(i+1<=grid.length-1){
            if(j-1>=0 && grid[i+1].charAt(j-1) == c+1) nextCharList.add(longestLengh(grid,i+1,j-1,grid[i+1].charAt(j-1)));
            if(grid[i+1].charAt(j) == c+1) nextCharList.add(longestLengh(grid,i+1,j,grid[i+1].charAt(j)));
            if(j+1<=grid[i].length()-1 && grid[i+1].charAt(j+1)==c+1) nextCharList.add(longestLengh(grid,i+1,j+1,grid[i+1].charAt(j+1)));
        }


        return (nextCharList.size()==0)?1: (1+ Collections.max(nextCharList));
    }
}
