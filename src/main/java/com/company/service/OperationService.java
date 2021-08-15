package com.company.service;

import com.company.entity.Operation;

public interface OperationService {
    void save(Operation operation);

    Operation getLastWithdrawalOperation(long accountNumber);
}
