package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturnRemainIfAmountUnder1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnRemain1000IfAmount0() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldNotReturnAnyRemainIfAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);

        assertEquals(actual, expected);
    }
}