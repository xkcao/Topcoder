package com.xiaokang;

public class ANDEquation {
    /*
0)
{1, 3, 5}
Returns: 1
5 AND 3 = 1
1)
{31, 7}
Returns: -1
Clearly, no AND-equation is possible in this case.
2)
{31, 7, 7}
Returns: 7
7 AND 31 = 7
Note that duplicate elements are possible in the input. If an element appears several times in A, it must be used the same number of times in the equation.
3)
{1,0,0,1,0,1,0,1,0,0,0,0,0,0,0,1,0,0, 0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,1}
Returns: 0
Zeros are possible in the input.
4)
{191411,256951,191411,191411,191411,256951,195507,191411,192435,191411, 191411,195511,191419,191411,256947,191415,191475,195579,191415,191411, 191483,191411,191419,191475,256947,191411,191411,191411,191419,256947, 191411,191411,191411}
Returns: 191411
5)
{1362,1066,1659,2010,1912,1720,1851,1593,1799,1805,1139,1493,1141,1163,1211}
Returns: -1
6)
{2, 3, 7, 19}
Returns: -1
     */
    public int restoreY(int[] A){
        for(int i=0;i<A.length;i++)
        {
            int RHS = A[i];
            boolean findFirst = false;
            int LHS = -1;

            for(int j=0;j<A.length;j++){
                if(j!=i){
                    if(!findFirst){
                        LHS = A[j];
                        findFirst = true;
                    }else{
                        LHS = LHS & A[j];
                    }
                }
            }

            if(RHS == LHS) return RHS;
        }
        return -1;
    }
}
