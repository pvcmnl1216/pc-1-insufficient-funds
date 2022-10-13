package com.jap.customexception;

public class Account {
    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int withdraw(int amount) throws InsufficientFundException {
        if (amount < accountBalance) {
            return accountBalance - amount;
        } else {
            throw new InsufficientFundException("Insufficient Balance");
        }
    }
}
