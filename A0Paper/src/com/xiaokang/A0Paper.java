package com.xiaokang;


public class A0Paper {
    /*Examples
            0)
    {0,3}
    Returns: "Possible"
    We have 0 pieces of A0 paper and 3 pieces of A1 paper. We can combine the two of the three A1 papers to get an A0.
            1)
    {0,1,2}
    Returns: "Possible"
    This time, we can combine two A2 papers to get a second A1. Afterwards, the two of A1s (the original one and the one we made from the two A2s) can be combined to obtain an A0.
            2)
    {0,0,0,0,15}
    Returns: "Impossible"
    An A0 paper can be assembled from 16 A4 papers, but here we only have 15.
            3)
    {2,0,0,0,0,0,0,3,2,0,0,5,0,3,0,0,1,0,0,0,5}
    Returns: "Possible"
    We already have two pieces of A0 paper, so we can just take one of them and we are done.*/

    public String canBuild(int[] A){
        double numberOfA0=0;
        for(int i=0;i<A.length;i++){
            numberOfA0 += A[i]/(Math.pow(2,i));
        }

        if (numberOfA0>=1)  return  "Possible";

        return "Impossible";
    }
}
