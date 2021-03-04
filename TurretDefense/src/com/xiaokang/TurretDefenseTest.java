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
        int expectedValue2=1;

        int[] xs3={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] ys3={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] times3={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,31};
        int expectedValue3=15;

        TurretDefense turretDefense = new TurretDefense();

        assertEquals(expectedValue1,turretDefense.firstMiss(xs1,ys1,times1));
    }
}