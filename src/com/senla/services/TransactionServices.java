package com.senla.services;

import com.senla.entities.Cash;
import com.senla.entities.Store;

import java.util.ArrayList;

public class TransactionServices {
    public TransactionServices() {

    }

    public ArrayList<Cash> getStoreCash(Store store) {
        return store.getCash();
    }

    public void addCashToStore(Store store, Cash cash) {
        store.setCash(cash);
    }

}
