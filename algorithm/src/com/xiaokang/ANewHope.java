package com.xiaokang;

public class ANewHope {
    /*
0)
{1,2,3,4}
{4,3,2,1}
3
Returns: 4
The example from the problem statement.
1)
{8,5,4,1,7,6,3,2}
{2,4,6,8,1,3,5,7}
3
Returns: 3
2)
{1,2,3,4}
{1,2,3,4}
2
Returns: 1
     */
    public  int count(int[] fs, int[] ls, int d){
        int n = fs.length;
        boolean same = true;
        for(int i = 0; i<n; i++)same &= fs[i] == ls[i];
        if(same) return 1;
        int[] as = new int[n], bs = new int[n];
        for(int i = 0; i<n; i++)
        {
            as[fs[i]-1] = i;
            bs[ls[i]-1] = i;
        }
        int min = 0;
        for(int i = 0; i<n; i++)
        {
            min = Math.min(min, bs[i] - as[i]);
        }
        System.out.println(min);

        return (-min+(n-d-1))/(n-d)+1;
    }
}
