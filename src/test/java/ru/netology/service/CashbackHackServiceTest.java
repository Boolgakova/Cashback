package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2800);
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemainWhenAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}