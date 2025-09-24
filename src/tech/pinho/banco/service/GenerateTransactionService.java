package tech.pinho.banco.service;

import java.math.BigDecimal;

public interface GenerateTransactionService {

    void execute(int accountNumber, BigDecimal amount, String description);
}
