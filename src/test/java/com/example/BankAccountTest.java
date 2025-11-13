package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000);
    }

    @Test
    void testInitialBalance() {
        assertEquals(1000, account.getBalance(), 0.01);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawSuccess() {
        assertTrue(account.withdraw(400));
        assertEquals(600, account.getBalance(), 0.01);
    }

    @Test
    void testWithdrawFail() {
        assertFalse(account.withdraw(1200));
        assertEquals(1000, account.getBalance(), 0.01);
    }
}
