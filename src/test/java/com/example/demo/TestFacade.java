package com.example.demo;

import com.example.demo.facade.BankAccountFacade;
import junit.framework.TestCase;

public class TestFacade extends TestCase {
    public void testBank() {
        BankAccountFacade bankAccountFacade = new BankAccountFacade("ongdevacc", 1234);
        bankAccountFacade.depositCash(1000000.00);
        bankAccountFacade.withdrawCash(900000.00);

    }
}
