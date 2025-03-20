package org.howard.edu.lsp.midterm.question2;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;


    // Constructor
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    //Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getYearPublished() {
        return yearPublished;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }   
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    //equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN);
    }
    //toString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
    public class BookDriver{
        public void main(String[] args) {
            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
            Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
            Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
            System.out.println(book1.equals(book2)); // true
            System.out.println(book1.equals(book3)); // false
            System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
        }
    }
}
