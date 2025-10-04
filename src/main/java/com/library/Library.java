package com.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println("✅ Book added: " + bookName);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\nBooks in Library:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}
