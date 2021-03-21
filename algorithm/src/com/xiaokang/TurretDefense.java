package com.xiaokang;

public class TurretDefense {
    public  int firstMiss(int[] xs, int[] ys, int[] times){

        int i;
        for(i=0;i<xs.length;i++){
            int timeNeeded;
            if(i==0){
                timeNeeded = xs[0]+ys[0];
            }
            else
            {
                timeNeeded = Math.abs(xs[i]-xs[i-1])+Math.abs(ys[i]-ys[i-1]);
            }

            int timeAvailable = (i==0)?times[i]:(times[i]-times[i-1]);

            if (timeNeeded>timeAvailable){
                return i;
            }
        }

        return (-1);
    }
}
