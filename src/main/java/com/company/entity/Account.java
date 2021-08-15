package com.company.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component("account")
public class Account {
    private long id;
    private boolean blocked;
    private int pin;
    private float balance;
}
