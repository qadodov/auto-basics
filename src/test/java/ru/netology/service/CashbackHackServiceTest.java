package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert.*;

public class CashbackHackServiceTest extends TestCase {

    @org.junit.Test
    public void testShouldReturnRemainIfAmountUnder1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testShouldReturnRemain1000IfAmount0() {

        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testShouldNotReturnAnyRemainIfAmount1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testShouldReturnProperRemainIfAmountOver1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(1600);

        assertEquals(expected, actual);
    }
}