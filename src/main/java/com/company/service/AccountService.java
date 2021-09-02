package com.company.service;

import com.company.entity.Account;

public interface AccountService {
    Account create();

    Account getAccountById(long number);

    int getPin(long number);

    void blockAccount(long number);

    float getBalance(long number);

    boolean isBlocked(long number);

    boolean checkPin(Integer pin, long accountNumber);

    boolean processWithdrawal(long number, float balance, String cardNumber);
}
