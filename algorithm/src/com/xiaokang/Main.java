package com.xiaokang;

import java.util.Arrays;

public class Main {

    @SuppressWarnings("CommentedOutCode")
    public static void main(String[] args) {
	// write your code here
        System.out.println("hello Topcoder algorithm!");

//        ABBADiv1 abbaDiv1 = new ABBADiv1();
//        System.out.println(abbaDiv1.canObtain("A","BABA"));

//        ABBAReplace abbaReplace = new ABBAReplace();
//        System.out.println(abbaReplace.countSteps("AABAA",17,47474747,1000000000));

//        ABC abc = new ABC();
//        System.out.println(abc.createString(15,36));

//        ABCPath abcPath = new ABCPath();
//        String[] grid = { "BCDEFGHIJKLMNOPQRSTUVWXYZ" };
//        System.out.println(abcPath.length(grid));

//        ABoardGame aBoardGame = new ABoardGame();
//        String[] board = {"..", ".."};
//        System.out.println(aBoardGame.whoWins(board));

//        ASCIISum asciiSum = new ASCIISum();
//        System.out.println(asciiSum.total(  3));
//        System.out.println(asciiSum.total(  6));
//        System.out.println(asciiSum.total(  10));
//        System.out.println(asciiSum.total(  400000000));

//        ASeries aSeries = new ASeries();
//        int[] input = {3,8,4,5,6,2,2};
//        System.out.println(aSeries.longest(input));

//        ATaleOfThreeCities aTaleOfThreeCities = new ATaleOfThreeCities();
//        int[] ax = {0,0,0};
//        int[] ay = {0,1,2};
//        int[] bx = {2,3};
//        int[] by = {1,1};
//        int[] cx = {1,5};
//        int[] cy = {3,28};
//        System.out.println(aTaleOfThreeCities.connect(ax,ay,bx,by,cx,cy));

//        AToughGame aToughGame = new AToughGame();
//        int[] prob1={1000,500};
//        int[] value1={3,4};
//        System.out.println("Expected Gain1="+aToughGame.expectedGain(prob1,value1));
//
//        int[] prob2={1000,1};
//        int[] value2={3,4};
//        System.out.println("Expected Gain2="+aToughGame.expectedGain(prob2,value2));
//
//        int[] prob3={500,500,500,500,500};
//        int[] value3={1,2,3,4,5};
//        System.out.println("Expected Gain3="+aToughGame.expectedGain(prob3,value3));
//
//        int[] prob4={250,750};
//        int[] value4={1000,1};
//        System.out.println("Expected Gain4="+aToughGame.expectedGain(prob4,value4));

//        Aaagmnrs aaagmnrs = new Aaagmnrs();
//        String[] input1 = {"Aaagmnrs", "TopCoder", "anagrams", "Drop Cote" };
//        String[] output1 = aaagmnrs.anagrams(input1);
//        System.out.println(Arrays.toString(output1));

        Abacus abacus = new Abacus();
        String[] input1 = {"ooo---oooooo", "---ooooooooo", "---ooooooooo", "---ooooooooo", "oo---ooooooo", "---ooooooooo"};
        int val1 = 5;
        String[] output1 = abacus.add(input1,val1);
        System.out.println(Arrays.toString(output1));
    }
}
