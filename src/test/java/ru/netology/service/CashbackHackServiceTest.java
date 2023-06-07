package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }


    @org.junit.Test
    public void testRemainWithCashback1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 50;
        int actual = service.remain(amount);
        int expected = 950;
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testRemainWithCashback2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void testRemainWithCashback3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
}