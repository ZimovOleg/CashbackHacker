package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldTestRemainIf800() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }



    @Test
    public void shouldTestRemainIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIs1300() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1300;
        int expected = 700;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIs1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIs1999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1999;
        int expected = 1;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(actual, expected,"При покупке на 1000, сервис считает не правильно, выдает 1000, а нужно 0");
    }


}