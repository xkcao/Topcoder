package com.xiaokang;

import static org.junit.Assert.*;

public class SubstituteTest {

    @org.junit.Test
    public void getValue() {
        String key1 = "TRADINGFEW";
        String code1 = "LGXWEV";
        int expectedValue1 = 709;

        String key2 = "ABCDEFGHIJ";
        String code2 = "XJ";
        int expectedValue2 = 0;

        String key3 = "CRYSTALBUM";
        String code3 = "MMA";
        int expectedValue3 = 6;

        Substitute substitute = new Substitute();

        assertEquals(expectedValue1,substitute.getValue(key1,code1));
        assertEquals(expectedValue2,substitute.getValue(key2,code2));
        assertEquals(expectedValue3,substitute.getValue(key3,code3));
    }
}