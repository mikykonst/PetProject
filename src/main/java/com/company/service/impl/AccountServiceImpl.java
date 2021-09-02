package com.company.service.impl;

import com.company.entity.Account;
import com.company.repository.AccountRepository;
import com.company.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;

    @Override
    public Account create() {
        return repository.save(new Account());
    }

    @Override
    public Account getAccountById(long number) {
        return repository.getById(number);
    }

    @Override
    public int getPin(long number) {
        return repository.getById(number).getPin();
    }

    @Override
    public void blockAccount(long number) {
        repository.getById(number).setBlocked(true);
    }

    @Override
    public float getBalance(long number) {
        return repository.getById(number).getBalance();
    }

    @Override
    public boolean isBlocked(long number) {
        return repository.getById(number).isBlocked();
    }

    @Override
    public boolean checkPin(Integer pin, long accountNumber) {
        return repository.getById(accountNumber).getPin() == pin;
    }

    @Override
    public boolean processWithdrawal(long number, float balance, String cardNumber) {
        Account account = repository.getById(number);
        float totalMoney = account.getBalance();
        if (totalMoney - balance < 0) {
            return false;
        } else {
            repository.getById(number).setBalance(totalMoney - balance);

            return true;
        }
    }
}
