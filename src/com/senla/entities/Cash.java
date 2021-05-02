package com.senla.entities;

import java.util.Date;

public class Cash {
    private final float  money;
    private final Date   dateOfTransaction;

    public Cash (float money) {
        this.money             = money;
        this.dateOfTransaction = new Date();
    }

    public float getMoney() {
        return money;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public String ToString() {
        return getMoney() + "," + getDateOfTransaction();
    }

}
