package com.senla.dao;

import com.senla.dataprocessor.DataProcessor;
import com.senla.entities.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OrderDAO {
    private final String path = "C:/Users/ilya Grey/OneDrive/Документы/GitHub/Tasks/src/com/senla/resources/";

    public void saveOrdersToFile(ArrayList<Order> orders) {
        try (FileWriter out = new FileWriter(path + "OrderData.txt", true)) {
            for (var order: orders)
                out.write(DataProcessor.convertOrderToString(order));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
