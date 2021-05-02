package com.senla.dataprocessor;

import com.senla.entities.Book;
import com.senla.entities.Order;
import com.senla.entities.Store;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataProcessor {
    private final String path = "C:/Users/Ilya Grey/Documents/GitHub/Tasks/src/com/senla/resources/";

    public void saveBooks(ArrayList<Book> books) {
        try (FileWriter out = new FileWriter(path + "BookData.txt", true)) {
            for (var book: books) {
                out.write(book.toString() + '\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveOrders(ArrayList<Order> orders) {
        try (FileWriter out = new FileWriter(path + "OrderData.txt", true)) {
            for (var order: orders) {
                out.write(order.toString());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveStore(Store store) {
        try (FileWriter out = new FileWriter(path + "StoreData.txt", true)) {
            out.write(store.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
