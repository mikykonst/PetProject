package com.company.controller;

import com.company.entity.Account;
import com.company.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AccountApiController {
    private final AccountService accountService;

    @PostMapping("/account")
    Account createAccount() {
        return accountService.create();
    }

    @GetMapping("/account")
    Account getAccountById(@RequestParam long id) {
        return accountService.getAccountById(id);
    }

    @GetMapping("/account/pin")
    int getPin(@RequestParam long id) {
        return accountService.getPin(id);
    }

    @GetMapping("/account/block")
    void blockAccount(@RequestParam long id) {
        accountService.blockAccount(id);
    }
}
