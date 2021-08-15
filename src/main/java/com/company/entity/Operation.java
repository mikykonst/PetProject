package com.company.entity;

import lombok.*;

import java.security.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class Operation {
    private long id;
    private long accountId;
    private Timestamp time;
    private float amount;

    private enum type {}

    ;
}
