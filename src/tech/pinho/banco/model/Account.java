package tech.pinho.banco.model;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    private int number;
    private BigDecimal balance;
    private Owner owner;
    private short agency;
    private AccountType type;
    private AccountStatus status;
    private List<AccountEntry> entries;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public short getAgency() {
        return agency;
    }

    public void setAgency(short agency) {
        this.agency = agency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public List<AccountEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<AccountEntry> entries) {
        this.entries = entries;
    }
}
