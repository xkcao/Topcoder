package com.xiaokang;

import static org.junit.Assert.*;

public class TurretDefenseTest {

    @org.junit.Test
    public void firstMiss() {
        int[] xs1={3,5,6};
        int[] ys1={7,5,6};
        int[] times1={11,15,16};
        int expectedValue1=2;

        int[] xs2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] ys2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] times2={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32};
        int expectedValue2=-1;

        int[] xs3={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] ys3={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] times3={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,31};
        int expectedValue3=15;

        int[] xs4={1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0,
                1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0};
        int[] ys4={1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0,
                1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0, 1000,0,1000,0,1000,0,1000,0,1000,0};
        int[] times4={2000,4000,6000,8000,10000,12000,14000,16000,18000,20000, 22000,24000,
                26000,28000,30000,32000,34000,36000,38000,40000, 42000,44000,46000,48000,50000,
                52000,54000,56000,58000,60000, 62000,64000,66000,68000,70000,72000,74000,76000,78000,80000,
                82000,84000,86000,88000,90000,92000,94000,96000,98000,100000};
        int expectedValue4=-1;

        int[] xs5={4,5};
        int[] ys5={4,5};
        int[] times5={7,8};
        int expectedValue5=0;

        int[] xs6={1,2,3,4,15};
        int[] ys6={1,2,3,4,15};
        int[] times6={100,200,300,400,405};
        int expectedValue6=4;

        TurretDefense turretDefense = new TurretDefense();

        assertEquals(expectedValue1,turretDefense.firstMiss(xs1,ys1,times1));
        assertEquals(expectedValue2,turretDefense.firstMiss(xs2,ys2,times2));
        assertEquals(expectedValue3,turretDefense.firstMiss(xs3,ys3,times3));
        assertEquals(expectedValue4,turretDefense.firstMiss(xs4,ys4,times4));
        assertEquals(expectedValue5,turretDefense.firstMiss(xs5,ys5,times5));
        assertEquals(expectedValue6,turretDefense.firstMiss(xs6,ys6,times6));
    }
}