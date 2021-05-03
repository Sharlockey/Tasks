package com.senla.dao;

import com.senla.dataprocessor.DataProcessor;
import com.senla.entities.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BookDAO {
    private final String path = "C:/Users/ilya Grey/OneDrive/Документы/GitHub/Tasks/src/com/senla/resources/";

    public void saveBooksToFile(ArrayList<Book> books) {
        try (FileWriter out = new FileWriter(path + "BookData.txt", true)) {
            for (var book: books)
                out.write(DataProcessor.covertBookToString(book) + '\n');

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
