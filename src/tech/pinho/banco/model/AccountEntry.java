package tech.pinho.banco.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AccountEntry {

    private BigDecimal amount;
    private LocalDateTime date;
    private AccountEntryType type;
    private String description;
    private String sourceOrOrigin;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public AccountEntryType getType() {
        return type;
    }

    public void setType(AccountEntryType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSourceOrOrigin() {
        return sourceOrOrigin;
    }

    public void setSourceOrOrigin(String sourceOrOrigin) {
        this.sourceOrOrigin = sourceOrOrigin;
    }
}
