package com.xiaokang;

public class Main {

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

        ATaleOfThreeCities aTaleOfThreeCities = new ATaleOfThreeCities();
        int[] ax = {0,0,0};
        int[] ay = {0,1,2};
        int[] bx = {2,3};
        int[] by = {1,1};
        int[] cx = {1,5};
        int[] cy = {3,28};
        System.out.println(aTaleOfThreeCities.connect(ax,ay,bx,by,cx,cy));
    }
}
